package ch1;

    // byte : 8비트
    // 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarLongEx1 {
    public static void main(String[] args) {
        // 변수 -> 값을 저장하기위한 공간 값은 매번 변할 수 있음
        // 기본타입 : 정수형, 문자형, 실수형, 불린형
        // 정수형 : byte(1), short(2), int(4), long(8) (주로 int, long사용)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)

        // 변수선언 : 타입 변수명 = 값;
        // 변수명 : 단어 2개이상 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
        // max-speed : 데이터베이스 필드명같은 경우 대시 - 사용
        // long : L, l 대소문자 둘다 가능하지만 알아보기쉽게 대문자를 사용권장
        long age = 15, maxSpeed = 100;
        long max = 256;
        long money = 1000000000000L; // L을 붙임으로써 long타입이라고 알려줌
        
        // 변수값 변경시 변수타입없이 변수명만 선언
        age = 30;


        // + : 산술연산
        // + : 연결 (문자가 들어가야함)
        System.out.println(money);
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);

    }
}
