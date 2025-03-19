package oop;

public class PersonEx {
    public static void main(String[] args) {

        // setter를 이용한 인스턴스생성
        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setPno("123");
        p1.setTel("010-1234-5678");
        System.out.println(p1); // Person(pno=123, name=홍길동, tel=010-1234-5678)

        Person2 p2 = new Person2();
        p2 = new Person2(null); // @RequiredArgsConstructor, @NonNull 두가지를 이용하여 해당 멤버변수만 이용하는 생성자

        // builder를 이용한 인스턴스생성
        Person2 person2 = Person2.builder()
                .pno("4567")
                .name("성춘향")
                .tel("010")
                .build();
    }
}
