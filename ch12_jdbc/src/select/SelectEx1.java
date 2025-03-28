package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Query;

public class SelectEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 문 결과담는 객체로 사용

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // Connection 객체 생성
            // jdbc:oracle:thin: => Oracle 연결문자열 (정해져있음)
            // @
            // localhost => 내 컴퓨터 (== 127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클DB명 (정해져있음 변경은가능)

            // Connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("연결되었습니다.");
            }

            // emp 테이블 조회하는 구문
            String sql = "select * from emp";

            // Statement 객체 생성
            pstmt = con.prepareStatement(sql);

            // Query 수행 및 결과 담기
            // SELECT 구문에서는 executeQuery사용
            rs = pstmt.executeQuery();

            // ResultSet 객체로부터 데이터 추출
            while (rs.next()) {
                // nulber => int
                int empno = rs.getInt(1);
                // varchar => String
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hireDate = rs.getString("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");

                System.out.printf("%d  %s  %s  %d  %s  %d  %d  %d\n", empno, ename, job, mgr, hireDate, sal, comm,
                        deptno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
    }
}
