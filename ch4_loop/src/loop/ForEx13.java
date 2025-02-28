package loop;

public class ForEx13 {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 소수 구하기
        // 소수 : 1과 자기자신을 제외한 어떠한 수로도 나누어 지지 않음
        System.out.println("1 ~ 100 사이의 소수는 다음과 같습니다.");
        for (int i = 2; i < 101; i++) {
            int count = 0; // 0으로 나누어 떨어지는 개수를 담는 변수 2여야만 소수임
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.printf("%2d ", i);
            }
        }

    }
}
