package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        // 변수 선언 - byte a(10), b(4)
        // byte, short 연산 수행 시 연산의 결과가 int형으로 자동변경됨
        byte a = 10, b = 4;
        double d = 15.4, f = 7.9;
        // byte c = a + b;
        
        // 해결책 1
        // int c = a + b;

        // 해결책 2 (결과값이 -128 ~ 127사이라면)
        byte c = (byte) (a + b);
        
        // +, -, *, /
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b); //자바에서의 나누기는 몫만 반환, 나머지는 버려짐
        // 소수점 float, double
        // a/(float)b == 10/4.000000
        // a(byte) / b(float) : 타입이 다른 경우 연산 시 큰 쪽으로 변환
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b); 
        System.out.printf("%.2f / %.2f = %.2f\n", d, f, d/f);  //double도 소수점 표현하므로 %f로 표현
   
    }
}
