package chapter18LambdaExpressions;

public interface TextUtil {
    static String quote(String s) {
        return String.format("<<%s>>", s);
    }

    static String reverse(String s){
        StringBuilder sB = new StringBuilder(s);
        return sB.reverse().toString();
    }
}
