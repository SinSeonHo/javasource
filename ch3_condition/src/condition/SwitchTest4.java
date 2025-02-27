package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3)

        // 컴퓨터가 내는 가위,바위,보 결정
        int computer = (int) ((Math.random() * 3) + 1); // 무작위 1,2,3 중에 1개반환

        // 사용자가 내는 가위,바위,보 결정
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3) 중에 하나 입력 : ");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 컴퓨터 1(가위) - 유저 1(가위) = 0 (비김)
        // 컴퓨터 2(바위) - 유저 1(가위) = 1 (컴퓨터 승)
        // 컴퓨터 3(보) - 유저 1(가위) = 2 (유저 승)
        // 컴퓨터 1(가위) - 유저 2(바위) = -1 (유저 승)
        // 컴퓨터 2(바위) - 유저 2(바위) = 0 (비김)
        // 컴퓨터 3(보) - 유저 2(바위) = 1 (컴퓨터 승)
        // 컴퓨터 1(가위) - 유저 3(보) = -2 (컴퓨터 승)
        // 컴퓨터 2(바위) - 유저 3(보) = -1 (유저 승)
        // 컴퓨터 3(보) - 유저 3(보) = 0 (비김)

        // 컴퓨터가 이겼습니다, user가 이겼습니다, 비겼습니다.

        int result = computer - user;
        switch (user) {
            case 1:
            case 2:
            case 3:
                switch (result) {
                    case -1:
                    case 2:
                        System.out.printf("컴퓨터 : %d, 유저 : %d\n", computer, user);
                        System.out.println("유저가 이겼습니다");
                        break;
                    case 1:
                    case -2:
                        System.out.printf("컴퓨터 : %d, 유저 : %d\n", computer, user);
                        System.out.println("컴퓨터가 이겼습니다");
                        break;
                    case 0:
                        System.out.printf("컴퓨터 : %d, 유저 : %d\n", computer, user);
                        System.out.println("비겼습니다");
                        break;
                }
            default:
                System.out.println("가위(1), 바위(2), 보(3) 중에 하나 입력하십시오");
                break;
        }

        scanner.close();
    }
}
