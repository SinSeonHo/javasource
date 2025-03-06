package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100]; // 객체배열생성
    private static Scanner sc = new Scanner(System.in); // static을 붙여서 생성

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
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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

    private static void createAccount() {
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

        // for문 실행하여 account[i] 객체배열중 첫번째 만나는 null발견시 아래작업수행
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break; // 루프 강제종료
            }
        }

    }

    private static void accountList() {

        // 계좌목록

        System.out.println("---------------------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("---------------------------------------------------");

        // 배열출력
        // System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(),
        // account.getBalance());

        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("계좌번호 : %s\t 계좌주 : %s\t잔액 : %d\n", account[i].getAno(),
        // account[i].getOwner(),
        // account[i].getBalance());
        // } else
        // break;
        // }

        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t %s\t %d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
            }
        }

    }

    private static void deposit() {

        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account가 가지고있는 계좌번호와 일치하는지 확인

        Scanner sc = new Scanner(System.in);
        System.out.print("예금하려는 계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);
        // findAcc 가 null일경우 .메소드 접근시 NullpointerException 발생
        if (findAcc != null) {
            System.out.print("예금액을 입력하세요 : ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.deposit(balance);
        }

        // 예금액 입력받기 => 잔액 += 예금액

        // account.balance = account.getBalance() + balance;

    }

    private static void withdraw() {

        System.out.println("출금하려는 계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);

        if (findAcc != null) {
            System.out.print("출금액을 입력하세요 : ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.withdraw(balance);
        }

    }

    private static Account findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌 중에서 일치하는 계좌 찾기
        for (int i = 0; i < account.length; i++) {
            // null이 아니어야 하고 account[i].getAno() == ano => break;
            if (account[i] != null && ano.equals(account[i].getAno())) {
                return account[i];
            }
            // break;
        }
        return null;
    }
}
