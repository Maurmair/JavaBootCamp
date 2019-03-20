package chapter18LambdaExpressions;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);
}
