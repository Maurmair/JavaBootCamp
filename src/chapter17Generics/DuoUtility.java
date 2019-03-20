package chapter17Generics;

public interface DuoUtility {
    static void printDuo(Duo<?> d){
        System.out.println(d.getFirst() + ", " + d.getSecond());
    }

    static void printUpper(Duo<String> s){
        String s1 = s.getFirst();
        String s2 = s.getSecond();
        System.out.println(s1.toUpperCase()+s2.toUpperCase());
    }

    static void printSum(Duo<? extends Number> d){
        Number n1 = d.getFirst();
        Number n2 = d.getSecond();
        System.out.println(n1 + "+" + n2 + "=" + (n1.doubleValue()+n2.doubleValue()));
    }

    static <T> void swapFirst(Duo<T> d1, Duo<T> d2){
        T temp = d1.getFirst();
        d1.setFirst(d2.getFirst());
        d2.setFirst(temp);
    }

    static <T> void swapSecond(Duo<T> d1, Duo<T> d2){
        T temp = d1.getSecond();
        d1.setSecond(d2.getSecond());
        d2.setSecond(temp);
    }

    static void printSum(Duo<? extends Number> d1, Duo<? extends Number> d2) {
        Number n1 = d1.getFirst();
        Number n2 = d1.getSecond();
        Number n3 = d1.getFirst();
        Number n4 = d1.getSecond();
        System.out.println(n1.doubleValue()+n2.doubleValue()+n3.doubleValue()+n4.doubleValue());
    }
}
