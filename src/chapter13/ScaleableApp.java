package chapter13;

import chapter10.Drawing;
import chapter8.Circle;
import chapter8.Rectangle;

public class ScaleableApp {
    public static void main(String[] args) throws  Exception{
        Rectangle r = new Rectangle(2,4,8,10);
//        System.out.println(r);
        r.scale(Scaleable.DOUBLE);
//        System.out.println(r);

        Circle c = new Circle(2,1,1);
//        System.out.println(c);
        c.scale(Scaleable.HALF);
//        System.out.println(c);
        Drawing dr = new Drawing();
        dr.add(r);
        dr.add(c);
        System.out.println(dr);
        dr.scale(Scaleable.QUARTER);
        System.out.println("\n\n"+dr);
        dr.scaleDouble();
        System.out.println("\n\n" +dr);
        dr.scaleHalf();
        System.out.println("\n\n" + dr);
    }
}
