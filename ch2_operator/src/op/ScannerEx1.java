package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 입력1 : ");
        String input = scanner.nextLine(); // 사용자가 입력한 값을 받아와서 input 변수문자열에 담는다 nextLine() : 문자열로 받는다

        System.out.println("두자리 정수 입력2 : ");
        String input2 = new String(scanner.nextLine());

        int num = Integer.parseInt(input); // 입력받은 문자열을 일반 숫자형태로 바꿔줌 ex) "45" -> 45
        int num2 = Integer.parseInt(input2);
        System.out.println("입력값 : " + num);
        System.out.println("입력값2 : " + num2);
        scanner.close();

    }
}
