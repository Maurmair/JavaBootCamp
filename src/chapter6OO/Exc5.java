package chapter6OO;

import java.util.Formatter;

public class Exc5 {
    public static void main(String[] args) {
//        float meter = 1;
        Formatter f = new Formatter();
        for (float meter = 1; meter <=20; meter+=0.5){
            String s = "%.2f meter = %.2f feet\n";
            f.format(s, meter, meter*3.28);
            System.out.println(f);
//            meter = meter + (float)0.5;
        }
        f.close();
    }
}
