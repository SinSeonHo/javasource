package oop;

public class Calc {
    // 사칙연산

    long add(long num1, long num2) {

        return num1 + num2;
    }

    long subtract(long num1, long num2) {

        return num1 - num2;
    }

    long multiply(long num1, long num2) {

        return num1 * num2;
    }

    double divide(double num1, double num2) {

        return num1 / num2;
    }

    // long타입의 입력값 2개
    // 입력값 2개중 큰 숫자 출력

    long max(long num1, long num2) {
        // 삼항연산자
        // 조건 ? 참 : 거짓;
        return (num1 < num2) ? num2 : num1;
        // if (num1 < num2) {
        // return num2;
        // } else {
        // return num1;
        // }
    }

    long min(long num1, long num2) {

        return (num1 > num2) ? num2 : num1;
        // if (num1 > num2) {
        // return num2;
        // } else {
        // return num1;
        // }
    }

}
