package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신민철", "홍길동");

        // 중복 제거 후 출력
        // 1) Set 2) Stream
        Set<String> set = new HashSet<>(names);
        System.out.println(set);

        names.stream().distinct().forEach(n -> System.out.println(n));
        System.out.println();

        // 신씨 성을 가진사람만 출력
        names.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        // 중복을 제거 후 신씨 성을 가진 사람만 출력
        names.stream()
                .distinct()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");
        // 대문자로 변경 후 출력
        for (String f : fruits) {
            System.out.println(f.toUpperCase());
        }

        // 대문자로 변경 후 새로운 리스트로 생성
        List<String> fruits2 = new ArrayList<>();
        for (String f : fruits) {
            fruits2.add(f.toUpperCase());
        }
        System.out.println(fruits2);

        // 위 내용을 stream으로 변경
        // (Function<String, String> mapper)
        List<String> list2 = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        // Stream 생성
        // IntStream.range(0, 0)
        // of(T... values) : 가변
        // of(T t) : 하나만
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        // 확장자 출력(중복된 확장자는 제외) - txt, bak, java

        // 추출된 확장자를 담을 구조가필요 set구조는 중복을 담지않으므로 적합
        Set<String> extSet = new HashSet<>();
        stream.forEach(f -> {
            // 확장자 추출
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                extSet.add(ext);
            }
        });
        System.out.println(extSet);

        // 위 내용을 stream으로 변경

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        stream2.map(f -> f.getName()) // ["file1.txt", "file2.txt"...] 파일객체를 스트링형태의 이름만남김
                .filter(f -> f.indexOf(".") > -1) // "file1.txt", "file2.txt", "file4.txt", "file5.txt"
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));
    }
}
