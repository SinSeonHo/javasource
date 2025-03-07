package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;

    }

    public boolean isHasTrafficCard() { // boolean은 get사용하지않고 is타입사용
        return hasTrafficCard;
    }

    // 교통비 지불메소드

    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통카드 기능이있다면 교통비 지불한다
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }
        // 카드번호, 잔액확인 후 지불한다
        // long balance = pay(cardNo, amount);
        // return balance;
        return pay(cardNo, amount);
    }
}
