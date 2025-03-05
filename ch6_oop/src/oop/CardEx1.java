package oop;

public class CardEx1 {
    public static void main(String[] args) {

        // static 으로 선언된 클래스변수와 메소드는 클래스명. 으로 접근한다

        System.out.println("카드 너비 " + Card.width); // 클래스 변수 width와 height는 별도의 Card인스턴스 생성없이 바로 부를 수 있다
        System.out.println("카드 높이 " + Card.height);

        Card card = new Card(); // 인스턴스변수 kind와 number는 new로 인스턴스를 생성해줘야 사용가능
        card.kind = "Heart";
        card.number = 7;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 7;
    }
}
