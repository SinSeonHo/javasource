package oop;

public class TriangleEx {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        // 인스턴스 변수 초기화
        triangle.baseLine = 7;
        triangle.height = 7;

        System.out.printf("밑변이 %d이고, 높이가 %d인 삼각형의 면적은 : %.2f입니다.\n", triangle.baseLine, triangle.height,
                triangle.getArea());

        triangle = new Triangle(20, 10);
        System.out.printf("밑변이 %d이고, 높이가 %d인 삼각형의 면적은 : %.2f입니다.\n", triangle.baseLine, triangle.height,
                triangle.getArea());

        Triangle triangle2 = new Triangle(20, 10);
        System.out.printf("밑변이 %d이고, 높이가 %d인 삼각형의 면적은 : %.2f입니다.\n", triangle2.baseLine, triangle2.height,
                triangle2.getArea());

    }
}
