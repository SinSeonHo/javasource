package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;

        System.out.println("String 숫자 => int변환 " + Integer.parseInt("10"));
        System.out.println("int 숫자 => String 숫자변환 " + i.toString());
        System.out.println("(5,8) max " + Integer.max(5, 8));
        System.out.println("(5,8) min " + Integer.min(5, 8));
    }
}
