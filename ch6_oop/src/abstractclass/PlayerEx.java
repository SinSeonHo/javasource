package abstractclass;

public abstract class PlayerEx { // 추상클래스 abstract 키워드 추가
    public static void main(String[] args) {
        // Cannot instantiate the type Player 인스턴스 생성불가
        // Player player = new Player();

        Player player = new CDPlayer();
        player.play();
        player = new AudioPlayer();
        player.play();
    }
}
