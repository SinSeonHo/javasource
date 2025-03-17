package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] seoul) {
        // 반환 : "Kim 은 3 번째에 있다"
        // 배열을 그대로 사용할 때
        // int i = 0;
        // for (; i < seoul.length; i++) {
        // if (seoul[i].equals("Kim")) {
        // break;
        // }
        // }

        // return "Kim은 " + (i + 1) + "번째에 있다.";

        // ---------------------------------------

        // List로 변경하고나서
        int i = Arrays.asList(seoul).indexOf("Kim");

        return "Kim 은 " + (i + 1) + " 번째에 있다.";
    }
}
