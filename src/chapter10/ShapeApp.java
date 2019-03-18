package chapter10;

import chapter8.Circle;
import chapter8.Rectangle;

public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(7);
        shapes[1] = new Circle(8);
        shapes[2] = new Rectangle(2,3,4,1);
//        shapes[3] = new Circle(2,3,4);

        for (Shape shape : shapes) {
            printInfo(shape);
        }
        Circle c1 = new Circle(1,2,3);
        Rectangle r1 = new Rectangle(4,5,6,7);
        Triangle t1 = new Triangle(8,9,10,11,12);

        System.out.println(c1);
        System.out.println(r1);
        System.out.println(t1);
    }

    private static void printInfo(final Shape shape) {
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimiter: " + shape.getPerimeter());
        System.out.println("Pos: " +shape.getX() + ", " + shape.getY());
        if(shape instanceof Rectangle) {
            System.out.println("Height: " + ((Rectangle) shape).getHeight());
        } else if (shape instanceof Circle) {
            System.out.println("Radius: " + ((Circle) shape).getRadius());
        }
    }
 }
