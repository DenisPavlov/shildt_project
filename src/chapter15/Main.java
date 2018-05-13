package chapter15;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer i) -> {};
        Function<String, Integer> fun = Integer::valueOf;
        Integer i = fun.apply("200");
        System.out.println(i);

        cons((Integer iq) -> {});
    }

    static void cons(Consumer<Integer> consumer) {

    }
}
