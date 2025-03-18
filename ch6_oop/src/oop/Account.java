package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString // ToString 메소드
@AllArgsConstructor // 멤버변수 전부 선택해서 생성자
@NoArgsConstructor // default 생성자
@Getter // Getter 메소드
@Setter // Setter 메소드
public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)

    private String ano;
    private String owner;
    private long balance;

    // // 생성자

    // // default생성자
    // public Account() {
    // }

    // // 멤버변수 초기화 생성자
    // public Account(String ano, String owner, long balance) {
    // this.ano = ano;
    // this.owner = owner;
    // this.balance = balance;
    // }

    // // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // // deposit, withdraw

    // public String getAno() {
    // return ano;
    // }

    // public String getOwner() {
    // return owner;
    // }

    // public long getBalance() {
    // return balance;
    // }

    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        // 인출액이 잔액보다 작으면 출금수행
        if (amount > balance) {
            return;
        }
        this.balance -= amount;
    }

    // @Override
    // public String toString() {
    // return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance +
    // "]";
    // }

}
