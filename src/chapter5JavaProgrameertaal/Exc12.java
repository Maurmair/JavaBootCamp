package chapter5JavaProgrameertaal;

public class Exc12 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = ++a * b-- < 2 ? --a : ++b;
        System.out.println(result);
    }
}
