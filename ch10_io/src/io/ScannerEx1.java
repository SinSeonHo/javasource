package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2) Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num1 = sc.nextInt(); // 5 엔터 입력시 숫자만 담기고 엔터는 남아있음
        System.out.println("연산자 입력(+,-,*,/) : ");
        // String op = sc.nextLine(); // 줄단위로 읽음 남아있는 엔터가 담겨버려서 건너뛰어짐
        String op = sc.next(); // 엔터 읽지않음
        System.out.println("숫자 입력 : ");
        int num2 = sc.nextInt();

        sc.close();
    }
}
