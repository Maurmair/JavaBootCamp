package chapter10;

import chapter8.Circle;
import chapter8.Rectangle;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle(1,2,3));
        drawing.add(new Rectangle(4,5,6,7));
        System.out.println(drawing.getSize());
        drawing.clear();
        System.out.println(drawing.getSize());
    }
}
