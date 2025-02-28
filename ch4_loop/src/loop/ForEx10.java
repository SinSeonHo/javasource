package loop;

import java.util.Scanner;

public class ForEx10 {
    public static void main(String[] args) {

        // *을 출력할 라인의 수 입력받기
        // 입력받은 라인만큼 * 찍기

        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 : ");
        // String input = scanner.nextLine();
        // int num = Integer.parseInt(input);
        int num = scanner.nextInt();

        System.out.println("");

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for (int i = 1; i < num + 1; i++) {
            for (int j = num; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");

                // } else {
                // System.out.print("*");
                // }

                System.out.print(j > i ? " " : "*");
            }
            System.out.println();
        }
        System.out.println();

    }

}
