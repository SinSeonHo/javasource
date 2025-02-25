package ch1;

    // byte : 8비트
    // 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarByteEx1 {
    public static void main(String[] args) { 
        // 변수 -> 값을 저장하기위한 공간 값은 매번 변할 수 있음
        // 기본타입 : 정수형, 문자형, 실수형, 불린형
        // 정수형 : byte(1), short(2), int(4), long(8) (주로 int, long사용)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)

        // 상수 : 값을 한번만 저장 (바뀌지 않는 값)
        // 상수선언 : 타입 상수명 = 값; final int MAX_VALUE = 100; (주로 대문자 사용)

        // 변수선언 : 타입 변수명 = 값;
        // 변수명 : 단어 2개이상 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
        // max-speed : 데이터베이스 필드명같은 경우 대시 - 사용
        byte age = 15, maxSpeed = 100;
        // byte max = 256;

        // System.out.println(age);
        // System.out.println(maxSpeed);

        // + : 산술연산
        // + : 연결 (문자가 들어가야함)
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed);
        System.out.printf("나이 : %d, 최고속도 : %d\n", age, maxSpeed);
        System.out.println(age + maxSpeed);

    }
}
