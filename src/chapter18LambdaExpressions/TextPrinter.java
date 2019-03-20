package chapter18LambdaExpressions;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter){
        for (String w : sentence.split(" ")) {
            if (filter.isValid(w)) {
                System.out.println(w+"\t");
            }
        }
    }

    public void printPorcessedWords(WordProcessor processor) {
        for (String s : sentence.split(" ")) {
            System.out.println(processor.process(s));
        }
    }
}
