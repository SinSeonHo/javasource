package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));

    }

    public static int count(String src, String target) {
        // indexOf
        int count = 0, num = 0;
        // System.out.println(src.indexOf("AB"));
        // System.out.println(src.indexOf("A"));

        // for (int i = 0; i < src.length(); i++) {
        // if ((num = src.indexOf(target, num)) != -1) {
        // count++;
        // num += target.length();
        // }
        // }

        while ((num = src.indexOf(target, num)) != -1) {
            count++;
            num += target.length();
        }
        return count;
    }
}
