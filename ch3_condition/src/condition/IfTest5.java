package condition;

public class IfTest5 {
    public static void main(String[] args) {
        // 주사위 1 ~ 6
        // 실행할때마다 무작위 값이 나옴
        // 0.0 <= Math.random() < 1.0
       System.out.println("랜덤값출력 : " + Math.random());
       
       // ((Math.random() * 6) : 0 ~ 5) + 1

       int num = (int) ((Math.random() * 6) + 1);

       // num 이 n이면 주사위 n번이 나왔습니다.
        System.out.println("num : " + num);
        
       if(num == 1) {
        System.out.println("주사위 1번이 나왔습니다.");
       }
       else if(num == 2) {
        System.out.println("주사위 2번이 나왔습니다.");
       }
       else if(num == 3) {
        System.out.println("주사위 3번이 나왔습니다.");
       }
       else if(num == 4) {
        System.out.println("주사위 4번이 나왔습니다.");
       }
       else if(num == 5) {
        System.out.println("주사위 5번이 나왔습니다.");
       }
       else {
        System.out.println("주사위 6번이 나왔습니다.");
       }

    }
}
