package array;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {

        // 배열 생서 시 변수의 타입에 따라 기본값이 설정됨
        // int : 0, double(float) : 0.0, boolean : false
        // String : null

        String names[] = { "Kim", "Park", "Yi" };

        String name[] = new String[2];
        System.out.println(Arrays.toString(name)); // 기본값 [null, null]

        int arr1[] = new int[2];
        System.out.println(Arrays.toString(arr1)); // 기본값 [0, 0]

        boolean arr2[] = new boolean[2];
        System.out.println(Arrays.toString(arr2)); // 기본값 [false, false]

    }
}
