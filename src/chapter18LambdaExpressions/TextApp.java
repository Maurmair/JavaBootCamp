package chapter18LambdaExpressions;

public class TextApp {
    public static void main(String[] args) {
        first();
        second();
        }

    private static void second() {


    }

    private static void first(){
        final String c = "e";
        TextPrinter tp = new TextPrinter("Hallo dit is een oefen zin om te kijken wat allemaal voldoet");
        System.out.println("*** WORDS CONTAINING E");
        tp.printFilteredWords((s -> s.contains(c)));
        System.out.println("*** WORDS LONGER THEN 4");
        tp.printFilteredWords((s -> s.length()>4));
        System.out.println("*** WORDS STARTING WITH A");
        tp.printFilteredWords((s -> s.startsWith("a")));
        System.out.println("*** WORDS 2ND LETTER IS E");
        tp.printFilteredWords((s -> s.charAt(1) == 'e'));
        System.out.println("*** WORDS 2x E");
        tp.printFilteredWords((s -> {
            int i =0;
            for (char d : s.toCharArray()){
                if (d == 'e'){
                    i++;
                }
            }
            return i == 2;
        }));
    }
}
