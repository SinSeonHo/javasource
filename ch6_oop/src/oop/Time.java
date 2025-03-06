package oop;

public class Time {
    // 속성 : 시, 분, 초

    private int hour;
    private int mintue;
    private float second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {

        // 입력값 hour가 1 ~ 23 사이에 있는지
        // 없다면 그냥 리턴
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public int getMintue() {
        return mintue;
    }

    public void setMintue(int mintue) {
        if (mintue < 0 || hour > 59) {
            return;
        }
        this.mintue = mintue;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (second < 0.0f || second > 59.99f) {
            return;
        }
        this.second = second;
    }

}
