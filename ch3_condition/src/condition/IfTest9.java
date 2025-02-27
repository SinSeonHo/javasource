package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        // 윤년, 평년 구하기
        // 년도입력 받기

        // 입력받은 년도가 윤년인지 평년인지 출력
        // 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아닐경우
        //                   or
        //        년도를 400으로 나눈 나머지가 0이면
        Scanner scanner = new Scanner(System.in);
        System.out.printf("년도를 입력하세요 : ");
        String input = scanner.nextLine();
        int years = Integer.parseInt(input);

        if ((years %4 == 0 && years %100 !=0) || (years %400 == 0)) {
            System.out.printf("입력하신 %d년은 윤년입니다.\n", years);
        }
        else {
            System.out.printf("입력하신 %d년은 평년입니다.\n", years);
        }
        scanner.close();
    }
}
