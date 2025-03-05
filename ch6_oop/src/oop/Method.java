package oop;

// 메소드형태 : 리턴타입 메소드명() {}
// 리턴(반환)타입 : 기본타입(int, boolean, char, double, float), 객체타입(대문자로시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() { // int이므로 return값 int형태로 반환

        int sum = 15;
        // return 0;
        return sum;
    }

    String method2() { // String은 객체타입이므로 null도 가능

        String str = "Hello";
        // return "";
        // return null;
        return str;
    }

    double method3() {

        return 35.5;
    }

    char method4() {

        return ' ';
    }

    void method5() { // void는 리턴타입이 없으나 return키워드 넣어도 됨
        return;
    }

    // 매게변수가 있는 메소드
    // 매게변수(void제외한 타입모두가능)가 있는 메소드
    // 매게변수 개수 상관없음
    int add(int x, int y) {
        return x + y;
    }

    float add2(int x, float y) {
        // float + int : float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ":" + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}