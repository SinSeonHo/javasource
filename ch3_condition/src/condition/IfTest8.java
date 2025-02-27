package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        // 임금 구하기
        
        int rate = 9800; //시간당 임금
        int pay, hours;  //

        // 사용자로부터 근무시간을 입력받아 hours 변수에 담기

        // 근무시간이 8시간 까지는 시간당 임금을 지불함
        // 8시간 초과근무시 시간당 임금의 1.5배를 지불함
        // 임금을 계산하여 pay변수에 담기

        // 최종 출력
        // 받는 임금은 120000 입니다.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("금일 근무시간을 시간단위로 입력하세요 : ");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);

        // 10시간 근무시 8시간은 9800 * 8 + 2 * 9800 * 1.5
        if (hours <= 8) {
            pay = hours * rate;
        }
        else {
            pay = (int) (rate * 8 + (rate * (hours - 8) * 1.5));
        }
            System.out.printf("받는 임금은 %d입니다", pay);
        scanner.close();
    }
}
