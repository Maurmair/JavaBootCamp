package chapter18LambdaExpressions;

import java.util.function.Consumer;

public class TextApp {
    public static void main(String[] args) {
        first();
//        second();
//        third();
//        fourth();
//        fifth();
//        sixth();
        }

    private static void fifth() {
        TextPrinter tp = new TextPrinter("22224 224333 311111 77111");
        tp.printNumberValues(Long::new);
    }

    private static void sixth() {
        TextPrinter tp = new TextPrinter("22224 224333 311111 77111");
        tp.printSum(Long::new);
    }

    private static void fourth() {
        TextPrinter tp = new TextPrinter("SADlnldasqwpopsl");
        tp.printPorcessedWords(String::toUpperCase);
    }

    private static void third() {
        TextScrambler textScrambler = new TextScrambler();
        TextPrinter tp = new TextPrinter("oefen alfa limo");
        tp.printPorcessedWords(textScrambler::scramble);
    }

    private static void second() {
        TextPrinter tp = new TextPrinter("omgekeerde tekst");
        tp.printPorcessedWords(TextUtil::reverse);

    }

    private static void first(){
        final String c = "e";
        TextPrinter tp = new TextPrinter("Hallo dit is een oefen zin om te kijken wat allemaal voldoet");
        Consumer<String> printer = System.out::println;
        System.out.println("*** WORDS CONTAINING E");
        tp.printFilteredWords((s -> s.contains(c)), printer);
        System.out.println("*** WORDS LONGER THEN 4");
        tp.printFilteredWords((s -> s.length()>4), printer);
        System.out.println("*** WORDS STARTING WITH A");
        tp.printFilteredWords((s -> s.startsWith("a")), printer);
        System.out.println("*** WORDS 2ND LETTER IS E");
        tp.printFilteredWords((s -> s.charAt(1) == 'e'), printer);
        System.out.println("*** WORDS 2x E");
        tp.printFilteredWords((s -> {
            int i =0;
            for (char d : s.toCharArray()){
                if (d == 'e'){
                    i++;
                }
            }
            return i == 2;
        }), printer);
    }
}
