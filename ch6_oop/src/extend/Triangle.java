package extend;

public class Triangle extends Shape {
    // int x;
    // int y;

    Point point[];

    public Triangle(Point[] point) {
        this.point = point;
    }

    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, ps = %s, color = %s]\n",
                point[0].getXY(), point[1].getXY(), point[2].getXY(), color);
    }

}
