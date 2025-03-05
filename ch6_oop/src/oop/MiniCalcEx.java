package oop;

// 메소드 종류

// 1. 인스턴스 메소드 : 클래스 영역 / 인스턴스가 생성되었을때 new
// 2. 클래스 메소드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성 완료되면)

// 같은 클래스 내에서 다른 메소드를 호출 가능
// 같은 클래스 내에서는 이름만 이용해서 호출가능

public class MiniCalcEx {
    public static void main(String[] args) {
        // static붙은 print() 메소드 호출
        // 클래스 메소드이기 때문에 객체 생성없이 클래스이름.으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // static안붙은 execute() 메소드 호출
        // 인스턴스 메소드이기 때문에 new를 통해 객체 생성 후 사용가능
        MiniCalc miniCalc = new MiniCalc();
        miniCalc.execute();
        miniCalc.a = 7;

    }
}
