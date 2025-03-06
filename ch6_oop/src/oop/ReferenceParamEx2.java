package oop;

import java.util.Arrays;

public class ReferenceParamEx2 {
    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 6, 5, 4 };
        printArr(arr);
        sorArr(arr);
        // 정렬후 결과출력
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));

    }

    static void printArr(int arr[]) {
        // [3,2,1,6,5,4]
        System.out.println(Arrays.toString(arr));
    }

    static int sumArr(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sorArr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
