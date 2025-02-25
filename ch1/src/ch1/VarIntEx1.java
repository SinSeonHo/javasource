package ch1;

    // byte : 8비트
    // 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarIntEx1 {
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
        int age = 15, maxSpeed = 100;
        int max = 256;
        
        // 변수값 변경시 변수타입없이 변수명만 선언
        age = 30;


        // + : 산술연산
        // + : 연결 (문자가 들어가야함)
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);

        // 형식화된 출력 (엔터는 안들어가 있으므로 \n으로 줄바꿈 해줘야함)
        // %b : boolean, %d : 정수, %f : 실수, %s : 문자열, %c : 문자
        System.out.printf("나이 : %d, 최고속도 : %d, max : %d\n", age, maxSpeed, max);
        System.out.printf("나이 : %10d, 최고속도 : %d, max : %d\n", age, maxSpeed, max); // 10칸 공간에 걸쳐서 표현 값이30이므로 2자리 제외한 8자리공백 후 표현
        
    }
}
