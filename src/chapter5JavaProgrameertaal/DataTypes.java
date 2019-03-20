package chapter5JavaProgrameertaal;

public class DataTypes {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        int c;
        c = (byte) a*b;

        long d = 2147483645;
        long e = 2147483642;
        long f = d*e;
        System.out.println(f);
        System.out.println(c);

    }
}
