package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEx1 {
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

            String sql = "update dept_temp set loc='SEOUL' WHERE deptno = 10";
            pstmt = con.prepareStatement(sql);
            // 따로 변수에담지않고 바로 실행 후 실행여부 출력
            System.out.println(pstmt.executeUpdate() > 0 ? "수정성공" : "수정실패");

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