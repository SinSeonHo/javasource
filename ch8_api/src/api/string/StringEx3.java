package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "Hello";
        // 문자열 연결 연산자 : +
        str += " World";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세요";
        str2 = str2.concat(" 반갑습니다.");
        System.out.println(str2);

        // endsWith(), startsWith()
        System.out.println("지정된 문자열로 종료 여부 " + str.endsWith("요"));
        System.out.println("지정된 문자열로 시작 여부 " + str.startsWith("요"));

        String file = "test.txt";
        // 이미지 : png or gif or jpg

        if (file.endsWith("png") || file.endsWith("gif") || file.endsWith("jpg")) {
            System.out.println("해당 파일은 이미지 입니다");
        } else {
            System.out.println("해당 파일은 이미지가 아닙니다");
        }

        // replace(), replaceAll(), replaceFirst()
        // replace() 결과는 새로운 문자열로 반환됨 / 원본은 변경 불가능
        System.out.println("replace(old, new) " + str.replaceAll("Hello", "안녕하세요"));
        System.out.println(str); // Hello World
        // 원본의 변경을 위해서는 = 을 사용하여 원본에 담는다
        str = str.replaceAll("Hello", "안녕하세요");
        System.out.println(str);

        // replaceAll() - 정규식 사용가능
        System.out.println(str.replaceAll("[a-z]", "1")); // 안녕하세요 W1111

        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "LL"));

        // subString() - 문자열 일부추출하여 새로운 문자열로 반환 원본 영향x
        str2 = "java.lang.Object";
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(10)); // Object
        // 시작위치부터 끝 위치전까지 문자열 추출하여 반환 끝 위치는 포함하지 않음
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(5, 9)); // lang

        // split()
        str2 = "dog,cat,bear";
        System.out.println("지정한 분리자로 나누어 배열로 변환" + Arrays.toString(str2.split(",")));
        String[] arr = str2.split(",", 2); // 지정된 숫자만큼만 분리
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 / 소문자 변경
        str2 = "HELLo";
        System.out.println("소문자 " + str2.toLowerCase());
        System.out.println("대문자 " + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        // " Hello".equals("Hello") => false
        String str3 = "   Hello World   ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 반환
        int i = 5;
        String str4 = String.valueOf(i); // "5" 둘다 문자열로변환
        str4 = i + ""; // "5" 둘다 문자열변환

    }
}
