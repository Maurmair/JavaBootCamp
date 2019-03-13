package chapter7;

import java.util.Arrays;

public class Exc5 {
    public static void main(String[] args) {
        System.out.println(average(2,5,7,2,8,39,6));
        System.out.println(min(3,7,1,124,6,8,1));
        System.out.println(max(0,2,7,2,5,11,666,221,24));
        System.out.println(average());
        System.out.println(min());
        System.out.println(max());
    }
    public static int average(int... values){
    int total = 0;
        for (final int value : values) {
            total += value;
        }
        int avg = 0;
        if (values.length != 0) {
            return total/values.length;
        }
        return 0;
    }

    public static int min(int... values){
        if(values.length != 0) {
            Arrays.sort(values);
            return values[0];
        }
        return 0;
    }

    public static int max(int... values){
        if(values.length!=0){
            Arrays.sort(values);
            return values[values.length-1];
        }
        return 0;
    }
}
