package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // Consumer
        // void accept(T t);
        // 숫자를 전달인자로 받아서 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(50);

        // 문자를 전달인자로 받아서 출력하기
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕하세요");

        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
        biConsumer.accept("안녕", "반가워");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(15.5);

        // LongConsumer, IntConsumer도 있음

        ObjDoubleConsumer<String> objDoubleConsumer = (str1, d) -> System.out.println(str1 + d);
        objDoubleConsumer.accept("안녕", 15.5);

        // Supplier
        // ------------------------------------------------------------------------------------------------
        // Math.random() : 1~6 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("1~6랜덤한 숫자출력 : " + supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("1~6랜덤한 숫자출력 : " + intSupplier.getAsInt());

        // Predicate
        // -------------------------------------------------------------------------------------------------
        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0이라면 빈 문자열입니다 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test("")) {
            System.out.println("빈 문자열 입니다.");
        }

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후 짝수라면 짝수입니다. 아니라면 홀수입니다. 출력
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        if (predicate2.test(3)) {
            System.out.println("짝수입니다.");
        } else
            System.out.println("홀수입니다.");

        // Function
        // -----------------------------------------------------------------------------------------------------
        // Function<T, R> T : type / R : return
        // 숫자를 문자로 반환
        Function<Integer, String> function = (i) -> String.valueOf(i);
        System.out.println(function.apply(35));

        // 사칙연산
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        System.out.println(biFunction.apply(5, 4));

        biFunction = (x, y) -> x * y;
        System.out.println(biFunction.apply(5, 4));

        biFunction = (x, y) -> x - y;
        System.out.println(biFunction.apply(5, 4));

        biFunction = (x, y) -> x / y;
        System.out.println(biFunction.apply(5, 4));
    }
}
