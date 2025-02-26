package condition;

// 특정 조건을 만족하면 문장을 실행
// if(조건문) {}

// 특정 조건을 만족하면 구문1 실행, 만족하지 않을 경우 구문2 실행
// if(조건문) {구문1} else {구문2}

public class IfTest1 {
    public static void main(String[] args) {
        int x = 0;

        if(x == 0) { //조건 true
            System.out.println("구문1 x == 0");
        }

        if(x != 0) { //조건 false
            System.out.println("구문2 x != 0");
        }
        
        if(!(x == 0)) { //조건 false
            System.out.println("구문3 !(x == 0)");
        }

        if(!(x != 0)) { //조건 true
            System.out.println("구문4 !(x != 0)");
        }

    }
}
