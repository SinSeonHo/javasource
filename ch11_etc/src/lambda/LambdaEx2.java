package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
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

        // ------------------------------------------------------------------------------------------------

        // Math.random() : 1~6 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("1~6랜덤한 숫자출력 : " + supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("1~6랜덤한 숫자출력 : " + intSupplier.getAsInt());

    }
}
