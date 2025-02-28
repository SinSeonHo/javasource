package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 1 ~ 100사이의 임의의 수 생성 / 생성된 숫자를 맞추기
        // 1 ~ 100사이의 임의의 정수를 입력받아서
        int answer = (int) ((Math.random() * 100) + 1); // 1 ~ 100 사이의 임의의 숫자생성
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1 ~ 100 사이의 정수를 입력하세요 >> ");
            input = scanner.nextInt();
            // for, while 과의 차이는 무조건 한번은 실행함 (조건검사는 나중에 진행함)
            if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("더 큰 수를 입력하세요");
            }

        } while (input != answer);

        System.out.printf("정답입니다. 프로그램을 종료합니다. (정답 : %d)", answer);
    }
}
