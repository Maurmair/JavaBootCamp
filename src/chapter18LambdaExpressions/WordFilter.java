package chapter18LambdaExpressions;

@FunctionalInterface
public interface WordFilter {
    public String isValid(String s);
}
