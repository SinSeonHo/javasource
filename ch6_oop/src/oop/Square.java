package oop;

public class Square {

    // 정사각형 클래스
    // 속성 : 길이(side_length)
    int side_length;

    // 생성자
    public Square(int side_length) {
        this.side_length = side_length;
    }

    public Square() {
    }

    // 기능 : 면적구하기

    int getArea() {
        return side_length * side_length;
    }

    @Override
    public String toString() {
        return "Square [side_length=" + side_length + "]";
    }

}
