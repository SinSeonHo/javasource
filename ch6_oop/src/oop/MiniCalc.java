package oop;

// 메소드 종류

// 1. 인스턴스 메소드 : 클래스 영역 / 인스턴스가 생성되었을때 new
// 2. 클래스 메소드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성 완료되면)

// 같은 클래스 내에서 다른 메소드를 호출 가능
// 같은 클래스 내에서는 이름만 이용해서 호출가능
// static - non-static : 생성되는 시기가 다르기때문에 호출 시점을 따져봐야 함
// static은 같은 static인 인자만 호출가능
// non-static은 static도 호출가능하고 non-static도 호출가능
// static은 보통 공통속성변수 선언시 사용

public class MiniCalc {

    static int k;
    int a, b;

    static void print() { // static이 붙으면 클래스 메소드
        // plus(3,4); avg();, execute();, println(); non-static이므로 생성이 되어있지않아 모두 호출불가능
        // => 호출하려면 new MiniCacl();로 생성

        // this.a = 7; <= new로 생성 후 사용가능
        k = 45; // static이므로 클래스변수라 이미 생성되어있기에 사용가능
    }

    int plus(int x, int y) {
        this.a = 7;
        k = 45;
        print(); // static이 붙은 메소드이므로 이미 생성되어있기에 호출가능
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행 결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
