package chapter18LambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }
    public TextPrinter(String sentence, Consumer<String> printer){
        this.sentence = sentence;
    }

    public void printFilteredWords(Predicate<String> filter, Consumer<String> printer){
        for (String w : sentence.split(" ")) {
            if (filter.test(w)) {
                printer.accept(w);
            }
        }
    }

    public void printPorcessedWords(Function<String, String> processor) {
        for (String s : sentence.split(" ")) {
            System.out.println(processor.apply(s));
        }
    }

    public void printNumberValues(NumberParser parser) {
        for (String w : sentence.split(" ")) {
            System.out.format("%,d%n", parser.parse(w));
        }
    }

    public  void printSum(NumberParser parser){
        Long lang = 0L;
        for (String w : sentence.split(" ")) {
            lang += parser.parse(w);
            System.out.format("%,d%n", parser.parse(w));
        }
        System.out.format("%,d%n", lang);
    }
}
