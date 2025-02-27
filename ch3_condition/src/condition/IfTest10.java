package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력받고 입력받은 수 중 가장 큰 수와 가장 작은 수 출력

        Scanner scanner = new Scanner(System.in);
        System.out.printf("첫번째 수 입력 : ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.printf("두번째 수 입력 : ");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.printf("세번째 수 입력 : ");
        input = scanner.nextLine();
        int num3 = Integer.parseInt(input);

        // if (num1 > num2 && num1 > num3 && num3 > num2) { //num1이 가장 큼 num2이 가장 작음
        //     System.out.println("가장 큰 수는" + num1 + "이고, 가장 작은 수는" + num2 + "입니다." );
        // }
        // else if (num1 > num2 && num1 > num3 && num2 > num3) { //num1이 가장 큼 num3이 가장 작음
        //     System.out.println("가장 큰 수는" + num1 + "이고, 가장 작은 수는" + num3 + "입니다." );
        // }
        // else if (num2 > num1 && num2 > num3 && num3 > num1) { //num2이 가장 큼 num1이 가장 작음
        //     System.out.println("가장 큰 수는" + num2 + "이고, 가장 작은 수는" + num1 + "입니다." );
        // }
        // else if (num2 > num1 && num2 > num3 && num1 > num3) { //num2이 가장 큼 num3이 가장 작음
        //     System.out.println("가장 큰 수는" + num2 + "이고, 가장 작은 수는" + num3 + "입니다." );
        // }
        // else if (num3 > num1 && num3 > num2 && num2 > num1) { //num3이 가장 큼 num1이 가장 작음
        //     System.out.println("가장 큰 수는" + num3 + "이고, 가장 작은 수는" + num1 + "입니다." );
        // }
        // else if (num3 > num1 && num3 > num2 && num1 > num2) { //num3이 가장 큼 num2이 가장 작음
        //     System.out.println("가장 큰 수는" + num3 + "이고, 가장 작은 수는" + num2 + "입니다." );
        // }

        int min = num1, max = num1; // min과 max변수를 각각 추가 후 첫번째 숫자를 대입

        if (min > num2) {           // min값과 num2값 비교 후 min값이 더 크면
            min = num2;             // min에 num2를 대입
        }
        if (min > num3) {           // min값과 num3값 비교 후 min값이 더 크면
            min = num3;             // min에 num3를 대입
        }
        
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }

        System.out.printf("가장 큰 수 : %d, 가장 작은 수 : %d\n", max, min);
        scanner.close();
        
    }
}
