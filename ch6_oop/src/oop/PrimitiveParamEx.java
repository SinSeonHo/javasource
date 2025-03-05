package oop;

// static 매소드 : 클래스 메소드

public class PrimitiveParamEx {

    public static void main(String[] args) {
        // main 메소드
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = " + d.x);
        // change(d.x); // 값의 복사가 일어남 주소의 복사가아님
        change2(d);
        System.out.println("After change()");
        System.out.println(d.x);

        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

    }

    // static void change(int x) { // 기본타입으로 매게변수
    // x = 10000;
    // System.out.println("change() : x = " + x);

    // }

    static void change2(Data d) { // 객체타입으로 매게변수
        d.x = 10000;
        System.out.println("change() : d.x = " + d.x);

    }
}
