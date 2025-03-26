package emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// ~~DAO : Data Access Object - DB 작업을 모아놓은 객체

public class EmpDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs; // select 문 결과담는 객체로 사용

    // static : 인스턴스변수, 인스턴스메소드 앞에 붙으면 공유의 의미를가짐(생성되는 모든 인스턴스가 같은 걸 사용)
    // 로드시점이 가장 처음에 로드됨 (객체 생성여부와 상관없이 로드됨)

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

    // select, insert, update, delete 처리 메소드

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "INSERT INTO emp_temp(EMPNO, ENAME, job, MGR, HIREDATE, sal, comm, DEPTNO) ";
            sql += "values(?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEName());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "UPDATE emp_temp SET sal = ? WHERE empno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delete(int empNo) {
        con = getConnection();

        String sql = "delete from emp_temp where empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setInt(1, empNo);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }
}
