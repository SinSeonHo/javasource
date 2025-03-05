package oop;

public class AccountEx {
    public static void main(String[] args) {

        // default 생성자사용하여 인스턴스생성
        Account account = new Account();
        // 멤버변수 초기화 생성자사용하여 인스턴스 생성
        account = new Account("110-10-0100", "홍길동", 100000);

        System.out.println(account);

        // 10000원 입금
        account.deposit(10000);
        System.out.println("현재 잔액 : " + account.balance);

        // 5000원 출금
        account.withdraw(5000);
        System.out.println("현재 잔액 : " + account.balance);
    }
}
