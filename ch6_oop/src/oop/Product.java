package oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // 제품번호(p10214), 제품명(운동화), 가격(124000), 제조년월(2025-03-04)

    String pCode;
    String pName;
    int price;
    LocalDate regiDate; // (자바에서 날짜를 담는 변수타입)

    // 기본default생성자 만들어줌
    // Product() {}

    // 기능 - 가격변경
    void changePrice() {

    }

    @Override
    public String toString() {
        return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
