package chapter18LambdaExpressions;
@FunctionalInterface
public interface NumberParser {
    Long parse(String s);
}
