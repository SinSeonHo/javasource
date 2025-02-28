package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {

        // 문자 입력받은 후 출력
        // q입력시 반복문 종료

        Scanner scanner = new Scanner(System.in);
        System.out.println("메시지를 입력하세요");

        String input;

        do {
            System.out.println("종료를 원하면 q 입력");
            System.out.print(">>");
            input = scanner.nextLine();

            System.out.println(input);
        } while (!input.equalsIgnoreCase("q")); // ==, != 대신 equals, equalsIgnoreCase로 문자열비교

        System.out.printf("프로그램을 종료합니다.");
    }
}
