package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.management.Query;

public class SelectEx4 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 문 결과담는 객체로 사용

        Scanner sc = new Scanner(System.in);

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // Connection 객체 생성
            // jdbc:oracle:thin: => Oracle 연결문자열 (정해져있음)
            // @
            // localhost => 내 컴퓨터 (== 127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클DB명 (정해져있음 변경은가능)

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            // if (con != null) {
            // System.out.println("연결되었습니다.");
            // }
            // System.out.print("조회 할 사원번호 입력 : ");
            // int empno = Integer.parseInt(sc.nextLine());

            // emp 테이블 조회하는 구문
            // String sql = "select * from EMP e where e.empno =" + empno;
            // 보안상의 이유로 위 방법은 좋지않음

            String sql = "SELECT e.EMPNO, e.DEPTNO, e.SAL, d.DNAME, d.LOC "; // 문자열로 붙어서 들어갔기에 끝에 공백을 줘야함
            sql += "FROM EMP e, DEPT d "; // 문자열로 붙어서 들어갔기에 끝에 공백을 줘야함
            sql += "WHERE e.DEPTNO = d.DEPTNO AND e.SAL <= 2500 AND e.EMPNO <= 9999";

            // Statement 객체 생성
            pstmt = con.prepareStatement(sql);
            // pstmt 쿼리구문중 첫번째 물음표에 empno값을 세팅하기
            // pstmt.setInt(1, empno);
            // Query 수행 및 결과 담기
            rs = pstmt.executeQuery();

            // ResultSet 객체로부터 데이터 추출
            while (rs.next()) {
                // nulber => int
                int empno = rs.getInt(1);
                int deptno = rs.getInt("deptno");
                int sal = rs.getInt("sal");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                System.out.printf("%d  %d  %d  %s  %s\n", empno, deptno, sal, dname, loc);
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
