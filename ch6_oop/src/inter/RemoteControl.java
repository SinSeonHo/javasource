package inter;

public interface RemoteControl {
    // 인터페이스에는 상수(public final static), 추상메소드(public abstract), default, static 메소드

    int MAX_VOLUME = 10;
    public final static int MIN_VOLUME = 0; // public final static 생략가능

    // public abstract 붙이지 않아도 추상메소드로 취급
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
