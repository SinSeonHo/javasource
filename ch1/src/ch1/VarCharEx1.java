package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한개 => 'a', '미', ' ' (홑따옴표 공백포함)
        // 문자열 : 글자 한개 ~ 여러개 => "미", "a", "abc", "대한민국", " " (쌍따옴표 공백포함)
        
        char ch1 = '기';        // 기 라는 문자를 ch1에 대입
        
        int unicode = ch1;      // ch1의 값을 unicode 변수에 대입 즉, int = char     약속된 코드숫자로 바뀜 (유니코드)
        System.out.println("ch1 = " + ch1);
        System.out.println("unicode = " + unicode); // '기' 라는문자의 unicode 값 44592출력됨

        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = " + ch2);
        System.out.println("unicode = " + unicode); // 소문자a의 값 '97' 암기권장
        
        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = " + ch3);
        System.out.printf("ch3 = %c\n", ch3);
        System.out.println("unicode = " + unicode); // 대문자A의 값 '65' 암기권장
    }
}
