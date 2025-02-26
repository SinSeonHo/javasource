package op;

// 논리연산자 : 비교연산자 여러개 연결할때 주로 사용 => true, false로 결과값 반환
// x가 4보다 작거나 10보다 크다
// &&(and), ||(or), !(not)
// true && true == true (둘다 true여야만 true)
// true || false == true (둘중 하나만 true여도 true)
// !true == false
// !false == true

import java.util.Scanner;

public class LogicalEx2 {
    public static void main(String[] args) {
        // 사용자로부터 문자를 입력받은 후 그 문자가 숫자인지 영문자인지 판별하는 프로그램 작성
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요 : ");
        
        String input = scanner.nextLine();

        // "abc" => "abc".charAt(0) : a 반환
        // "abc" => "abc".charAt(1) : b 반환
        // 문자열을 문자로 분해해서 돌려받을 수 있음 .charAt(index) 인덱스는 0부터 시작
        char ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

    }
}
