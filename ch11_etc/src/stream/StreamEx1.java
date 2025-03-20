package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "성춘향", "김자바");

        for (String string : list) {

        }

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }

        // Stream
        Stream<String> stream = list.stream();

        // Consumer<String> action;
        // forEach(Consumer<? super String> action) : void
        stream.forEach(str -> System.out.println(str));

        // stream has already been operated upon or closed
        // 다시 사용하려면 재생성 해야함
        // stream.forEach(str -> System.out.println(str));

        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));

        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);

        });

        students.stream().forEach(stu -> System.out.println(stu.toString()));

    }
}
