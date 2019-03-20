package chapter10;

import java.util.Iterator;

import chapter8.Circle;

/**
 * App for creating a {@Link Drawing} object and filling it with a list of {@LinkShapes}
 */
public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle(1,2,3));
//        drawing.add(new Rectangle(4,5,6,7));
        drawing.add(new Circle(1,2,3));
//        drawing.add(new Rectangle(4,5,6,7));
//        System.out.println(drawing.getSize());
//        drawing.clear();
//        System.out.println(drawing.getSize());
        Iterator<Shape> it = drawing.iterator();
        for (Object s: drawing){
            if (s != null){
                System.out.println(s);
            }
        }
//        for (Object s: drawing){
//            System.out.println(s.toString());
//        }
    }
}
