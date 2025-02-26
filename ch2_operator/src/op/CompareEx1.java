package op;

// 비교연산자 : 결과는 true or false로 반환
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// \t (tap1회)
// %b (boolean 값 출력)
// 두 변수의 타입이 다를경우 타입을 맞춘 후 비교
public class CompareEx1 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", (10==10.0f));   
        System.out.printf("'0' == 0 \t %b\n", ('0'== 0));   // 문자'0' -> 48에 해당 결국 해당구문은 48 == 0 인지 확인 따라서 false값 반환
        System.out.printf("'A' == 65 \t %b\n", ('A'== 65));   // 65 == 65 따라서 true값 반환
        System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B'));   // 65 > 66 따라서 false값 반환
        System.out.printf("'A'+1 != 'B' \t %b\n", ('A'+1 != 'B'));   // 65 + 1 != 66 따라서 false값 반환
    }
}
