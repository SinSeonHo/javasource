package extend;

public class CreditLineAccount extends Account {
    // 마이너스 계좌
    // 은행계좌 + 마이너스
    // 잔액 + 마이너스허용한도

    private int creditLine; // 마이너스 한도

    // public CreditLineAccount() {
    // super();
    // }

    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
        // TODO Auto-generated constructor stub
    }

    // 오버라이딩
    // 잔액 + 마이너스한도 - 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도초과.");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - amount);
    }
}
