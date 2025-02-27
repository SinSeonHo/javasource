package loop;

public class WhileEx4 {
    public static void main(String[] args) {
        // 구구단 출력
        // 7단 출력
        // for (int i = 1; i < 10; i++) {
        // System.out.printf("7 * %d = %2d\n", i, (7*i));
        // }

        int i = 1;
        while (i < 10) {
            System.out.printf("7 * %d = %2d\n", i, (7 * i));
            i++;
        }
    }
}
