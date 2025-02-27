package loop;

public class ForEx5 {
    public static void main(String[] args) {
        // 1 ~ 100사이의 숫자중에서

        // 1. 3의 배수의 합 출력
        int sum = 0;

        for (int i=1; i<101; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.printf("1) 1 ~ 100의 숫자중 3의 배수의 합 : %d\n", sum);

        // 2. 3의 배수는 더하고 9의 배수는 뺀 합을 출력
        sum = 0;
        for (int i=1; i<101; i++) {
            if ((i % 3 == 0) && (i % 9 != 0)) {
                sum += i;
            }
        }
        System.out.printf("2) 1 ~ 100의 숫자중 3의 배수는 더하고 9의 배수는 뺀 값 : %d\n", sum);

        
        // 3. 3의 배수와 5의 배수의 총합 출력
        sum = 0;
        for (int i=1; i<101; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            } 
        }
        System.out.printf("3) 1 ~ 100의 숫자중 3의 배수와 5의 배수의 총합 : %d\n", sum);
    }
}
