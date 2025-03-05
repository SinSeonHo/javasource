package oop;

public class Student {
    // 멤버변수, 멤버메소드, 생성자

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234),
    // 이메일(hong@gmail.com)

    // 멤버변수
    String stuId;
    String name;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // 클래스명(){}

    public Student() { // 기본(default)생성자 생성자는 여러개 만들수있으나 ()안에 아무것도없거나 갯수가 달라야 함
    }

    // 생성자 목적
    // 1. 멤버변수 초기화
    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {

        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    public Student(int grade, int classNum) { // int grade, int classNum 전달인자 지역변수 (멤버변수아님)
        this.grade = grade; // this => 객체 자기자신, 멤버변수 혹은 멤버메소드 앞에만 사용가능
        this.classNum = classNum;
    }

    // 기능 : 전화번호변경, 이메일변경, 학년변경, 반변경
    // 메소드 : 리턴타입 메소드명() {}
    // 리턴(반환)타입 : 기본타입(int, boolean, char, double, float), 객체타입(대문자로시작), 배열,
    // void(리턴타입 없음)
    void changeTel(String phone) {
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changeGrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
