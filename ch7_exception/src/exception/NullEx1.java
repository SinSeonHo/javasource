package exception;

public class NullEx1 {
    public static void main(String[] args) {

        String str = null;

        // System.out.println(str.length());

        Account accounts[] = new Account[5];

        for (Account account : accounts) {
            if (account != null) { // NullPointerException은 if문으로 null확인하는 조건걸어서 예방가능
                System.out.println(account.getAno());
            }
        }

        try {
            for (Account account : accounts) { // account는 accounts에서 가져왔으므로 accounts가 null임

                System.out.println(account.getAno()); // account가 null임

            }
        } catch (NullPointerException e) {
            // e.printStackTrace(); // 개발자 입장에서 확인가능
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해 주세요.");

        }

    }
}
