package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // Connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            String sql = "insert into dept_temp(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK')";
            pstmt = con.prepareStatement(sql);

            // Query 수행 및 결과 담기
            // SELECT 외에는 executeUpdate 사용
            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : "입력실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Statement close
                // Connection close
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
