package chapter19Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exc2 {
    public static void main(String[] args) {
//        one();
        two();
    }

    private static void two() {
        String[] words  = {"The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
        String res = Stream.of(words)
                    .reduce(";", (acc, el) -> acc + el + ";");
        System.out.println(res);
    }

    private static void one() {
            int[] cijfers = {2,6,3,8,1,3};
            //        IntStream intStream = IntStream.of(cijfers);
            long aantal = IntStream.of(cijfers).count();
            OptionalInt max = IntStream.of(cijfers).max();
            OptionalInt min = IntStream.of(cijfers).min();
            OptionalDouble avg = IntStream.of(cijfers).average();
            int sum = IntStream.of(cijfers).sum();
            System.out.println(
                    aantal  + " " + max.getAsInt()
                            + " " + min.getAsInt()
                            + " " + avg.getAsDouble()
                            + " " + sum);

    }
}
