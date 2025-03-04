package array;

import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {
        // 2차원배열
        // 타입[][] 배열명 = new 타입[][];

        // 2차원배열 선언 및 생성
        // int arr1[][] = new int[2][2];

        // 값을 알고 있는 경우
        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0; // 과목별 총점

        System.out.println("  번호    국어    영어    수학    총점    평균");
        System.out.println("================================================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%4d\t", i + 1);
            int sum = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%6d\t", score[i][j]);
                sum += score[i][j];
            }
            avg = sum / (float) score[i].length;

            System.out.printf("%6d\t", sum);
            System.out.printf("%6.1f\t", avg);
            System.out.println();
        }

        System.out.println("================================================");
        System.out.printf("과목총점 %6d\t%6d\t%6d\t", korTotal, engTotal, mathTotal);

    }
}
