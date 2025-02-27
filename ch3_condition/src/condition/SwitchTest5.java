package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수(0~100)입력받은 후 점수에 따라 등급 출력
        // 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지는 F

        // 98 / 10 = 9, 100 / 10 = 10

        Scanner scanner = new Scanner(System.in);
        System.out.printf("점수 (0 ~ 100)를 입력하세요 : ");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A등급입니다");
                break;
            case 8:
                System.out.println("B등급입니다");
                break;
            case 7:
                System.out.println("C등급입니다");
                break;
            default:
                System.out.println("F등급입니다");
                break;
        }

        scanner.close();
    }
}
