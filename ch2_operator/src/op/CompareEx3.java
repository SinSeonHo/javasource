package op;

// 비교연산자 : 결과는 true or false로 반환
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// 문자열 : "a", "abc"

public class CompareEx3 {
    public static void main(String[] args) {
        
        // 변수선언 : 기본타입 (ch1-VarByteEx1 참조)
        // 문자열은 기본타입으로 선언하지 않고, 객체타입으로 선언 (대문자로 선언시 객체타입)
        String str1 = "abc";                         
        String str2 = "abc";                         
        String str3 = new String("abc");    
        String str4 = new String("ABC");
        
        // str1(str2)을 저장하는 공간과 str3을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 == (값비교) 을 사용하면 true
        // 다른 공간에서 저장된 문자열 비교시 == (주소비교) 을 사용하면 false

        System.out.printf("str1 == str2 = %b\n", (str1 == str2)); // 같은 값이므로 true
        System.out.printf("str1 == str3 = %b\n", (str1 == str3)); // 다른 주소를 가리키므로 false

        // 문자열 비교시 안전한 비교를위해 == 대신, equals(), equalsIgnoreCase() 사용
        // 자바는 대소문자를 구분하므로 abc == ABC -> false
        System.out.printf("str1.equals(str3) = %b\n", (str1.equals(str3))); //true
        System.out.printf("str1.equals(str3) = %b\n", (str1.equals("ABC"))); //false
        System.out.printf("str1.equals(str3) = %b\n", (str1.equalsIgnoreCase(str3))); //true
        System.out.printf("str1.equals(ABC) = %b\n", (str1.equalsIgnoreCase("ABC"))); // true 대소문자 구분없이 문자열비교
        System.out.printf("str1.equals(ABC) = %b\n", (str4.equalsIgnoreCase("abc"))); // true 대소문자 구분없이 문자열비교
        

    }
}
