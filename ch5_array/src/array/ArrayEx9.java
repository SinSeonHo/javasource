package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {

        int numArr[] = new int[10];

        // numArr 0~9로 초기화

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));

        // 두 변수에서 서로의 값을 교환하는 과정
        // int a = 10, b = 15;

        // int temp = a; // 빈공간 하나 생성 후 변수값 하나를 옮겨담는다
        // a = b;
        // b = temp;

        for (int i = 0; i < 100; i++) {
            // 교환위치 임의생성 : 0 ~ 9
            int pos = (int) (Math.random() * 10);

            int temp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = temp;

        }

        System.out.println(Arrays.toString(numArr));

    }
}
