package extend;

// 클래스간의 관계
// 1) 상속관계 isa
// 2) 포함관계 hasa (String또한 마찬가지)
//    한 클래스안에 다른 클래스가 멤버변수로 선언

// 관계 결정하기
// plblic class Circle extends Point {}
// extends: 원(Circle)은 점(Point) 이다 : Circle is a Point
// 포함 : 원(Circle)은 점(Point)을 가지고 있다 : Circle has a Point

// Car, SportsCar
// SportsCar 는 Car이다(o) or SportsCar는 Car를 가지고 있다

public class Circle extends Shape {
    // int x;
    // int y;

    Point point;
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() { // 오버라이딩 - 부모클래스 Shape에 draw메소드가있지만 내용다르게하면 자식클래스에서 똑같은 이름으로 선언가능
        System.out.printf("[center = (%d,%d), r = %d, color = %s]\n",
                point.x, point.y, r, color);
    }

}
