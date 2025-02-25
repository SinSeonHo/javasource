package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // 소수점 형태의 숫자를 사용하면 기본적으로 double로 인식함
        // float(4btyte) = double(8byte) 성립불가 float = double로 인식시킨 셈
        // float 타입은 f, F 를 붙임

        float score1 = 90.14f;

        double score2 = 98.5d; //double 타입도 d, D 붙여주면 좋음
        
        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        System.out.printf("score2 = %.2f\n", score2); // 소수점 둘째자리까지만 표현
    }
}
