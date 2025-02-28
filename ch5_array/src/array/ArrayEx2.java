package array;

import java.util.Arrays;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가능

public class ArrayEx2 {
    public static void main(String[] args) {

        // 길이가 10인 int형 배열 생성
        int[] arr = new int[10];
        // int arr[] = new int[10]; [] 변수명 앞 뒤 다 가능

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        // 배열 요소의 값 확인
        // 1) for문 사용 : 원하는 형태로 출력가능
        // 2) 향상된 for문 사용 : 1)의 장점과 같음
        // 3) Arrays.toString(배열명) : [해당 괄호안에 배열요소 출력] => 확인용

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        int idx = 0;
        for (int i : arr) { // 향상된 for문 index 사용불가 필요하면 직접 idx변수 선언 후 사용해야함
            System.out.print(++idx + "-" + i + "\t");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
