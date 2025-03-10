package abstractclass;

public abstract class Player { // 추상클래스 abstract 키워드 추가
    // 멤버변수
    boolean pause;
    int currentPos;

    // 생성자
    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(); // 추상메소드

    void pause() { // 일반메소드

    }
}

class CDPlayer extends Player {

    @Override
    void play() { // 추상클래스로부터 상속받는 곳에서 반드시 구현해야함 오버라이딩 필수!!
        System.out.println("CD플레이어");
    }

}

class AudioPlayer extends Player {

    @Override
    void play() { // 추상클래스로부터 상속받는 곳에서 반드시 구현해야함 오버라이딩 필수!!
        System.out.println("Audio플레이어");
    }

}
