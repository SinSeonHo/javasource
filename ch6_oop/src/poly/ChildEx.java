package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();

        child1.method1();
        child1.method2();
        child1.method3();

        // parent 접근 범위
        // parent.field1;
        parent.method1(); // parent method1()
        parent.method2(); // child method2() new Child형태이기에 오버라이딩 된 메소드가 실행됨

        // The method methid3() is undefined for the type Parent
        // parent.method3();

        // method3에 접근하려면??
        // 부모 = 자식 (o)
        Child child2 = (Child) parent; // 강제형변환 - 캐스팅
        child2.method3();

        // java.lang.ClassCastException class poly.Parent
        // 자식 = 부모 (x) 강제형변환 불가
        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        child2.method3(); // ClassCastException
    }
}
