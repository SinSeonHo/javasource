package poly;

public class Car3 {
    // 멤버변수의 타입 : 기본, 객체(대문자로 시작, 배열)
    // 기본 : 정수형 - 0 , 실수 - 0.0 , boolean - false...
    // 객체 : null

    Tire frontLeft = new HankookTire(5, "앞 왼쪽"); // 멤버변수 선언과 동시에 초기화
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    // 생성자 선언으로 초기화
    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    int num;

    // 초기화 1) 생성자 사용 / 2) set메소드 사용 / 3) 멤버변수 선언하면서 초기화하기
}
