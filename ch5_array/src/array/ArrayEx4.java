package array;

import java.util.Arrays;
import java.util.Scanner;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가능

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n명 학생의 수학점수를 입력받아서 평균, 총합 구하기
        // System.out.print("학생의 수 입력 >> ");
        // int num = sc.nextInt();

        // int[] arr = new int[num]; // 배열 선언 및 입력받은 수만큼 생성
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(i + 1 + "번째 학생 점수 입력 >> ");
        // arr[i] = sc.nextInt();
        // sum += arr[i];
        // }

        // System.out.println("현재 입력된 점수 : " + Arrays.toString(arr));

        // System.out.printf("평균 : %.2f점, 총합 : %d점", (double) sum / arr.length, sum);

        System.out.print("학생의 수 입력 >> ");
        int num = sc.nextInt();

        int[] arr = new int[num]; // 배열 선언 및 입력받은 수만큼 생성
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 학생 점수 입력 >> ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        avg = (double) sum / arr.length;

        System.out.println("현재 입력된 점수 : " + Arrays.toString(arr));

        System.out.printf("평균 : %.2f점, 총합 : %d점", avg, sum);

    }
}
