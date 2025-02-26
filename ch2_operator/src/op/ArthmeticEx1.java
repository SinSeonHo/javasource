package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        // 변수 선언 - int a(10), b(4)

        int a = 10, b = 4;
        
        // +, -, *, /
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b); //자바에서의 나누기는 몫만 반환, 나머지는 버려짐
        // 소수점 float, double
        // a/(float)b == 10/4.000000
        // a(int) / b(float) : 타입이 다른 경우 연산 시 큰 쪽으로 변환  (같은 4바이트지만 숫자를 표현하는 범위가 틀리기에 float가 int보다 더 큼!!)
        System.out.printf("%d / %.0f = %.1f\n", a, (float)b, a/(float)b); 
   
    }
}
