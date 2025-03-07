package extend;

public class BonusPointAccount extends Account {
    // 예금액의 1% 보너스포인트로 지급

    private double bounsPoint;

    public BonusPointAccount(String ano, String owner, long balance, double bounsPoint) {
        super(ano, owner, balance);
        this.bounsPoint = bounsPoint;
    }

    public double getBounsPoint() {
        return bounsPoint;
    }

    // 보너스포인트 = 보너스포인트 + (예금액 * 1%)
    // 예금하다 메소드를 오버라이딩하여 수정하기로

    @Override
    void deposit(long amount) {
        // 예금하다 부모클래스
        super.deposit(amount);
        // 보너스포인트 추가
        bounsPoint += amount * 0.01;
    }

}
