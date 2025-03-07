package extend; // 1. 패키지 선언

import java.util.Scanner; // 2. import 필요시 선언

public class AccountEx { // 3. class
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CheakingAccount의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨
        CheckingAccount cAccount = new CheckingAccount("110-11", "홍길동", 100000, "123-1234");

        System.out.println("계좌번호 : " + cAccount.getAno());
        System.out.println("계좌주 : " + cAccount.getOwner());
        System.out.println("잔액 : " + cAccount.getBalance());
        System.out.println("체크카드번호 : " + cAccount.getCardNo());

        try {
            // System.out.println("현재잔액 : " + cAccount.pay("456", 100));
            System.out.println("현재잔액 : " + cAccount.pay("123-1234", 1000));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("222-22", "성춘향", 500000, 1000000);
        try {
            // creditLineAccount.withdraw(3000000);
            creditLineAccount.withdraw(300000);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        BonusPointAccount bonusPointAccount = new BonusPointAccount("222-22", "성춘향", 500000, 0);
        try {
            bonusPointAccount.deposit(100000);
            System.out.println("보너스포인트 : " + bonusPointAccount.getBounsPoint());
        } catch (Exception e) {
            e.printStackTrace();
        }

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("222-22", "성춘향", 500000, "222-1234",
                false);

        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("222-22", "성춘향", 500000, "222-1234",
                true);

        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("222-1234", 1700));
            System.out.println("현재잔액 : " + checkingTrafficAccount.payTrafficCard("222-1234", 1700));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
