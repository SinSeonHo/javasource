package ch1;
// 형변환 (Casting)
// 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// char -> int, int -> char, float -> int, int -> float ...
// 자바는 작은 타입에서 큰 타입으로의 형변환은 허용
// 큰 타입에서 작은타입으로의 형변환은 손실이 발생하므로 강제 형변환 (casting)
public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = " +d);
        int score = (int)d;  // double타입의 d값을 int타입의 score에 강제형변환(casting) 후 대입
        System.out.println("score = " +score); // 캐스팅을통한 강제형변환에따른 값 손실발생

        int intValue = 10;
        double dblValue = 5.5;

        int result = intValue + (int)dblValue; // 결과는 무조건 큰 타입 int + double = double
        System.out.printf("result = %d\n", result);
        
        float f1 = 9.1234567f;
        double d1 = 9.1234567;
        
        double d2 = f1; // 작은타입에서 큰 타입으로 대입은 문제없음

        double result2 = d1 + f1;

        int num = 97;
        char ch1 = (char)num;
        System.out.println(ch1);

    }
}
