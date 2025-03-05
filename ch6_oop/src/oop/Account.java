package oop;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)

    String ano;
    String owner;
    long balance;

    // 생성자

    // default생성자
    public Account() {
    }

    // 멤버변수 초기화 생성자
    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit, withdraw

    void deposit(long money) {
        this.balance += money;
    }

    void withdraw(long money) {
        this.balance -= money;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
