package oop;

// Tv 클래스를 이용하여 Tv(객체or인스턴스) 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버변수 (클래스내에 선언된 변수 main내에 선언된 변수아님)
// 2. 기능(동작) => 멤버메소드 

public class Tv {
    // 크기(int), 색상(String), 채널(int), 볼륨(int)
    int size;
    String color;
    int channel;
    int volume;
    boolean power;

    // 채널변경, 볼륨변경, 전원켜기/끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
