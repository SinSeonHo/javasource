package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        Stream<String> stream = fruits.stream(); // fruits 리스트를 stream 스트림으로 변환

        // Consumer<? super String> action
        stream.map(s -> s.toUpperCase())
                .peek(s -> System.out.println("중간확인 : " + s))
                .forEach(s -> System.out.println(s));

        fruits.stream().map(String::toUpperCase).forEach(System.out::println); // 하나의 메소드만 호출하는 람다식에서는 클래스명::메소드명으로
                                                                               // 줄일수있음

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        stream2.map(f -> f.getName()) // ["file1.txt", "file2.txt"...] 파일객체를 스트링형태의 이름만남김
                .peek(f -> System.out.print(f + " "))
                .filter(f -> f.indexOf(".") > -1) // "file1.txt", "file2.txt", "file4.txt", "file5.txt"
                .peek(f -> System.out.print(f + " "))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));

        // 원래 fruits의 형태는 "apple", "grape", "melon", "watermelon", "banana"이다
        // skip과 limit를 통해 다음 구문의 결과는 melon, watermelon만 출력된다
        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println();
        fruits.stream().skip(2).limit(2).forEach(System.out::println);

        // 스트림 연결
        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "hij" };

        // 배열 -> 스트림으로
        // Arrays.stream(arr1); // 1. Arrays를 이용
        Stream.of(arr1); // 2. of이용
        Stream<String> stream3 = Stream.of(arr1);
        Stream<String> stream4 = Stream.of(arr2);
        Stream<String> newStream = Stream.concat(stream3, stream4); // 같은타입의 스트림일경우 concat을 이용하여 연결가능

    }
}
