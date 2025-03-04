package array;

// 배열   --->   추후 List로 대체가능
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가능

public class ArrayEx1 {
    public static void main(String[] args) {
        // 학생 100명의 점수를 입력
        // int[] 배열명 = new int[100]; 배열선언, 생성

        int[] scores = new int[5]; // 배열선언 및 배열공간생성

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 74, 100 }; // 배열값을 알때 공간생성과동시에 값 대입

        // 세번째 학생의 점수 출력

        System.out.println("세번째 학생 : " + scores2[2]); // 배열의 index는 0부터 시작하므로 index2가 세번째 학생이다
        System.out.println("배열의길이 : " + scores2.length); // 배열의 길이를 확인함으로써 총 몇명의 학생의 점수를 보관하는지 확인할 수 있다

        // 다섯번째 학생의 점수 수정

        scores2[4] = 98;

        System.out.println("다섯번째 학생 : " + scores2[4]);

        // ArrayIndexOutOfBoundsException
        System.out.println(scores2[5]);
    }
}
