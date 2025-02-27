package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산 및 결과 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자(+, -, *, /, %) 하나를 입력하세요 : ");
        String op = scanner.nextLine();

        System.out.println("첫번째 피연산자를 입력하세요 : ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 피연산자를 입력하세요 : ");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("입력값을 확인해주세요");
                System.exit(0); //프로그램 종료
                
        }

            System.out.printf("%d %s %d = %d", num1, op, num2, result);
    
        scanner.close();
    }
}
