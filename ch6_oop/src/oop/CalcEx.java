package oop;

public class CalcEx {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // 더하기
        // return 타입이 있다면(void가 아니라면)
        // 1) 변수에 return값 담기
        // 2) 출력문 사용
        int num1 = 45, num2 = 15;
        long resultAdd = calc.add(num1, num2);
        System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
        System.out.printf("%d - %d = %d\n", num1, num2, calc.subtract(num1, num2));
        System.out.printf("%d * %d = %d\n", num1, num2, calc.multiply(num1, num2));
        System.out.printf("%d / %d = %.2f\n", num1, num2, calc.divide(num1, num2));

        double d1 = 35.5, d2 = 10;
        System.out.printf("%.2f / %.2f = %.2f\n", d1, d2, calc.divide(d1, d2));

        System.out.println("=======================");
        System.out.printf("%d, %d 중 큰 수는 : %d\n", num1, num2, calc.max(num1, num2));
        System.out.printf("%d, %d 중 작은 수는 : %d\n", num1, num2, calc.min(num1, num2));

    }

}
