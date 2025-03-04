package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 배열 : 한번 생성하면 길이 변경 불가
        int arr[] = { 78, 99, 52, 35, 14 };

        // 기존 배열에 값 추가를 해야한다면
        // 새로운 배열공간을 생성 후
        int tmp[] = new int[10];

        // 기존 배열값 복사
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        System.out.println(Arrays.toString(tmp));

        // System.arraycopy() 사용 <- 배열값복사 (범위를 지정하여 한번에 복사가능)

        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
        // length);
        // System.arraycopy(원본배열지정, 원본배열에서 복사할 시작위치, 새배열지정, 새배열 위치, 복사할 개수);

        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 1, arr.length);
        System.out.println(Arrays.toString(tmp2));

    }
}
