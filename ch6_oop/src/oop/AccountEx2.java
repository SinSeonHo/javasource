package oop;

import java.util.Scanner;

public class AccountEx2 {

    private static Account account;
    static Scanner sc = new Scanner(System.in); // static을 붙여서 생성

    public static void main(String[] args) {

        // 인스턴스 생성 후 접근
        // AccountEx2 obj = new AccountEx2();

        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------------");

            System.out.print("작업 선택 : ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    account = createAccount();
                    break;
                case 2:
                    accountList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("작업번호 확인");
                    break;
            }
        }
    }

    private static Account createAccount() {
        // new Account("110-10-0100", "홍길동", 100000);
        // 계좌번호입력
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        // 계좌주입력
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        // 잔액입력
        System.out.print("잔액 : ");
        long balance = Integer.parseInt(sc.nextLine());

        return new Account(ano, owner, balance);
    }

    private static void accountList(Account account) {

        // 계좌목록

        System.out.println("---------------------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("---------------------------------------------------");

        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
    }

    private static void deposit(Account account) {

        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account가 가지고있는 계좌번호와 일치하는지 확인

        Scanner sc = new Scanner(System.in);

        System.out.print("예금하려는 계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        if (ano.equals(account.getAno())) {
            System.out.print("예금액을 입력하세요 : ");
            int balance = Integer.parseInt(sc.nextLine());
            account.deposit(balance);
        } else
            return;

        // 예금액 입력받기 => 잔액 += 예금액

        // account.balance = account.getBalance() + balance;

    }

    private static void withdraw(Account account) {

        System.out.println("출금하려는 계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        if (ano.equals(account.getAno())) {
            System.out.print("출금액을 입력하세요 : ");
            int balance = Integer.parseInt(sc.nextLine());
            account.withdraw(balance);
        } else
            return;

    }
}
