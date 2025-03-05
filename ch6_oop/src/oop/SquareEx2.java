package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        // 타입 배열명 = new 타입[5];
        // 타입 배열명 = {};

        // 객체 배열
        // 객체(클래스)명 배열명 = new 객채(클래스)명[5];
        Square squareArr[] = new Square[5];
        System.out.println(Arrays.toString(squareArr)); // [null, null, null, null, null]

        // 객체 배열 초기화
        // squareArr[0] = new Square(); // sideLength = 0
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        // sideLength 값 부여하기
        squareArr[0].side_length = 35;
        squareArr[1].side_length = 15;
        squareArr[2].side_length = 12;
        squareArr[3].side_length = 98;
        squareArr[4].side_length = 68;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.println(i + 1 + " 번째 면적 : " + squareArr[i].getArea());
        }

    }
}
