package oop;

// private : 외부 클래스에서 접근 불가능

public class TvEx {
    public static void main(String[] args) {

        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(60, "white"); // 생성자를 통한 Tv2클래스변수 초기화
        // The field Tv2.size is not visible
        // tv2.size = 60; //Tv2클래스에는 변수가 private로 선언되어있어서 외부클래스에서 접근불가

        // tv전원
        tv2.power();
        // 채널변경
        tv2.changeChannel(7);

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeChannel(11);

        // ===============================================================================================

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString()); // Tv [size=0, color=null, channel=0, volume=0, power=false]

        obj1.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());

    }

}
