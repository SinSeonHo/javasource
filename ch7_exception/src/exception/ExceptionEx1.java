package exception;

public class ExceptionEx1 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        try {
            for (int i = 0; i < 30; i++) {
                result = number / (int) Math.random() * 10; // 에러발생가능성있는 구간
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("오류 발생.");
        }

    }

}
