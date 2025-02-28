package array;

import java.util.Arrays;
import java.util.Scanner;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가능

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 5명 학생의 수학점수를 입력받아서 평균, 총합 구하기

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 학생 점수 입력 >> ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("현재 입력된 점수 : " + Arrays.toString(arr));

        System.out.printf("평균 : %.2f점, 총합 : %d점", (double) sum / arr.length, sum);

    }
}
