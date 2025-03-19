package lambda;

public class Lambda1 {
    int max(int a, int b) {
        return a > b ? a : b;
    }

    // (a, b) -> a > b ? a : b; // 메소드명, 매게변수타입, 리턴 모두 날림

    void print(String name, int i) {
        System.out.println(name + i);
    }

    // (name, i) -> System.out.println(name + i);

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += 1;
        }
        return sum;
    }

    // (int[] arr) -> {
    // int sum = 0;
    // for (int i : arr) {
    // sum += 1;
    // }
    // return sum;
    // }
}
