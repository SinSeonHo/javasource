package loop;

public class ForEx11 {
    public static void main(String[] args) {

        // for (int i = 2; i <= 9; i++) { // 구구단은 2~9단까지있음
        // for (int j = 1; j <= 9; j++) {
        // System.out.printf("%d * %d = %d", i, j, i * j);
        // System.out.println();
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %2d", j, i, i * j);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %2d", i, j, i * j);
                System.out.print("\t");
            }
        }
    }
}
