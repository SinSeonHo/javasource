package loop;

import java.util.Scanner;

public class StarPt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        
        for (int i = 0; i < num; i++) {
             for (int j = 0; j <= i; j++) {
             System.out.print("*");
             }
             System.out.println("");
        }
        
    }
}
