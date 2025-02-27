package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        
        // num1 이라는 변수 선언 후 임의의 값 담기
        // num1 이 짝수인지 홀수인지 판별하는 프로그램
        // num1 %2 == 0 짝수 홀수 판별하는 코드

        // int num1 = 25;

        // if (num1 %2 == 0) {
        //     System.out.println("짝수");
        // }
        // else {
        //     System.out.println("홀수");
        // }

        // -------------------------------------------------------------------------------------

        // 사용자로부터 입력을 받아 num1 이라는 변수에 담고
        // num1 이 짝수인지 홀수인지 판별하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.printf("임의의 숫자를 입력하세요 : ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        if (num1 %2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }
        scanner.close();
    }
}
