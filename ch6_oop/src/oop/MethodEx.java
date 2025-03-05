package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {

        // Method 인스턴스 생성
        Method method = new Method();

        // 메소드 호출
        int result1 = method.add(15, 25);
        System.out.println("result1 = " + result1);

        float result2 = method.add2(35, 45.2f);
        System.out.println("result2 = " + result2);

        System.out.println(method.add(45, 55));

        method.print("홍길동", "s123"); // void일때는 호출만 하고 끝 변수에 담을 수 없음

        //
        int arrTest[] = { 1, 2, 3, 4, 5 }; // int형 배열선언
        int arrTest2[] = method.arr(arrTest); // return값 int형 배열인 메소드 호출
        System.out.println(Arrays.toString(arrTest2));

    }
}
