package loop;

import java.util.Scanner;

public class StarPtMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------------");

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------------");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
