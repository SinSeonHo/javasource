package oop;

// private : 외부 클래스에서 접근 불가능
// public : privete의 반대개념 (접근제한없음)

public class Tv3 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자 제공

    public Tv3() {

    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter, getter메소드

    // setter : 인스턴스 변수 값 변경
    // getter : 인스턴스 변수 값 return하여 사용

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() { // boolean타입은 is로 시작
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // void changeChannel(int channel) {
    // this.channel = channel;
    // }

    // 채널변경, 볼륨변경, 전원켜기/끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    // void power() {
    // power = !power;
    // }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
