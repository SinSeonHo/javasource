package op;

// 증감연산자 : +1, -1 간단하게 처리
// ++, --로 표현
// ++, -- : 변수 앞(전위연산자), 변수 뒤(후위연산자)
// 전위연산자든 후위연산자든 단독으로 사용시 결과 동일
// 다른 수식에 포함되거나, 메서드의 매개변수에 사용되는 경우
// 즉, 단독으로사용되지 않을 시 결과가 다르다
 

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;

        ++num; //num++; //num = num + 1;
        System.out.println("num = " + num);

        --num; //num--; //num = num - 1;
        System.out.println("num = " + num);

        int num2 = 20;
        // ++num2;
        // ① num2 + 1 을 먼저 계산 후 사용
        // num2++;
        // ① num2 값을 먼저 사용 후 +1 계산됨
        System.out.println("num2 = " + (++num2));

    }
}
