package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.net.aso.q;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs; // select 문 결과담는 객체로 사용

    static {
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Connection 객체 생성
    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            // Statement close
            // Connection close
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            // ResultSet close
            // Statement close
            // Connection close
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DML(INSERT, UPDATE, DELETE) + SELECT 작업
    // insert, delete, update : int로 리턴
    // select : ~~DTO(WHERE 절에 PK가 지정될경우) or List<~~DTO>(그 외) 형태로 리턴

    // insert, update : 전달인자 ~~DTO로 설정

    public List<MemberDTO> getNameList(String name) {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();

            String sql = "select * from member where name like ?";
            pstmt = con.prepareStatement(sql);

            // 물음표 처리
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            // select 구문 실행한 결과를 담은 객체 rs를 => dto로 옮겨야함

            while (rs.next()) {
                MemberDTO mDTO = new MemberDTO();
                // ResultSet 객체로부터 데이터 추출
                mDTO.setNo(rs.getInt("no"));
                mDTO.setId(rs.getString("id"));
                mDTO.setName(rs.getString("name"));
                mDTO.setAddr(rs.getString("addr"));
                mDTO.setEmail(rs.getString("email"));
                mDTO.setAge(rs.getInt("age"));
                // mDTO.setRemark(rs.getString("remark"));
                list.add(mDTO);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public List<MemberDTO> getList() {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();

            String sql = "SELECT * FROM MEMBER";
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            // select 구문 실행한 결과를 담은 객체 rs를 => dto로 옮겨야함

            while (rs.next()) {
                MemberDTO mDTO = new MemberDTO();
                // ResultSet 객체로부터 데이터 추출
                mDTO.setNo(rs.getInt("no"));
                mDTO.setId(rs.getString("id"));
                mDTO.setName(rs.getString("name"));
                mDTO.setAddr(rs.getString("addr"));
                mDTO.setEmail(rs.getString("email"));
                mDTO.setAge(rs.getInt("age"));
                // mDTO.setRemark(rs.getString("remark"));
                list.add(mDTO);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public MemberDTO getRow(String id) {
        MemberDTO mDTO = null;

        try {
            con = getConnection();

            String sql = "SELECT * FROM MEMBER WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();
            // select 구문 실행한 결과를 담은 객체 rs를 => dto로 옮겨야함

            if (rs.next()) {
                mDTO = new MemberDTO();
                // ResultSet 객체로부터 데이터 추출
                mDTO.setNo(rs.getInt("no"));
                mDTO.setId(rs.getString("id"));
                mDTO.setName(rs.getString("name"));
                mDTO.setAddr(rs.getString("addr"));
                mDTO.setEmail(rs.getString("email"));
                mDTO.setAge(rs.getInt("age"));
                // mDTO.setRemark(rs.getString("remark"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return mDTO;
    }

    public int insert(MemberDTO memberDTO) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "INSERT INTO MEMBER(no, id, name, addr, email, age) ";
            sql += "VALUES (member_seq.nextval, ?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);
            // 물음표있다면 해결
            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // delete : 전달인자로 대부분 pk를 사용하게됨
    // 현재 pk는 id이므로 id정보를 받아서 삭제를 수행
    public int delete(String id) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "DELETE FROM MEMBER WHERE id = ? ";

            pstmt = con.prepareStatement(sql);
            // 물음표있다면 해결
            pstmt.setString(1, id);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(MemberDTO memberDTO) {

        // memberDTO
        // 1. id, addr 이 담겨있는경우
        // 2. id, email 이 담겨있는경우

        int result = 0;

        try {
            con = getConnection();

            String sql = "UPDATE MEMBER ";

            if (memberDTO.getAddr() != null) {
                sql += "SET addr = ? ";
                sql += "WHERE id = ? ";
                pstmt = con.prepareStatement(sql);
                // 물음표있다면 해결
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else {
                sql += "SET email = ? ";
                sql += "WHERE id = ? ";
                pstmt = con.prepareStatement(sql);
                // 물음표있다면 해결
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());
            }

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
