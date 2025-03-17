package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            // 개발자 기준에서 예외 발생원인 확인
            e.printStackTrace();
        }
    }
}
