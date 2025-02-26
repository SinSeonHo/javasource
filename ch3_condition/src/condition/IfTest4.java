package condition;

import java.util.Scanner;

// 특정 조건을 만족하면 문장을 실행
// if(조건문) {}

// 특정 조건을 만족하면 구문1 실행, 만족하지 않을 경우 구문2 실행
// if(조건문) {구문1} else {구문2}

public class IfTest4 {
    public static void main(String[] args) {
       
       //score 점수를 입력받아
       //score >= 90 등급은 A입니다.
       //score >= 80 등급은 B입니다.
       //score >= 70 등급은 C입니다.
       //score >= 60 등급은 D입니다.
       //score < 60 등급은 F입니다.
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("점수를 입력하세요 : ");
       String input = scanner.nextLine();
       int score = Integer.parseInt(input);

        if(score >= 90) {
            System.out.println("등급은 A입니다.");
        }
        else if(score >= 80) {
            System.out.println("등급은 B입니다.");
        }
        else if(score >= 70) {
            System.out.println("등급은 C입니다.");
        }
        else if(score >= 60) {
            System.out.println("등급은 D입니다.");
        }
        else {
            System.out.println("등급은 F입니다.");
        }
       
        scanner.close();
    }
}
