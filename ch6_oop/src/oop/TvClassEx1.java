package oop;

// OOP (Object Oriented Programming - 객체지향프로그래밍)
// 재사용성 높음
// 코드의 관리가 용이함
// 신뢰성 높은 프로그램 작성

// 자바는 기본 코드단위가 클래스이다
// 클래스 : 객체를 정의한 것, 설계도, 틀 의 개념
// 클래스 용도 : 객체 생성

// 객체 : 사물( ex)책상,의자,자동차, TV 등 ), 개념 ( 수학공식 등 )

// 붕어빵 기계 (클래스) - 붕어빵 (객체)

// 객체와 인스턴스
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은 책상 클래스의 인스턴스이다

public class TvClassEx1 {
    public static void main(String[] args) {
        // 인스턴스 생성
        // 클래스명 변수명 = new 클래스명();

        Tv tv1 = new Tv(); // 인스턴스 생성
        Tv tv2 = new Tv();

        // 속성확인
        System.out.println(tv1); // oop.Tv@5ca881b5 => Tv [size=0, color=null, channel=0, volume=0, power=false]
        System.out.println(tv2); // oop.Tv@24d46ca6

        // 인스턴스 사용
        tv1.color = "black";
        tv1.channelUp();
        System.out.println("tv1 현재채널 : " + tv1.channel);
        System.out.println("tv1 현재색상 : " + tv1.color);

        // 메소드 => 호출시 ()를 가지고있으면 메소드
        tv2.power(); // 메소드 호출 (메소드 실행)
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
