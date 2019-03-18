package chapter8;

import chapter10.Shape;

public class Circle extends Shape {
    public static final int ANGLES = 0;
    private static int count = 0;
    private int radius;

    public Circle(){
        this(0);
    }
    public Circle(final int radius){
        this(Math.abs(radius),0,0);
    }
    public Circle(final int radius, final int x, final int y){
        setRadius(radius);
        setX(x);
        setY(y);
        this.radius = Math.abs(radius);
        count++;
    }

    public Circle(final Circle circle){
        setX(circle.getX());
        setY(circle.getY());
        this.radius = Math.abs(circle.getRadius());
        count++;
    }

    public int getRadius() {
        return Math.abs(radius);
    }

    public void setRadius(int radius) {
        this.radius = Math.abs(radius);
    }

    public double getArea(){
        return Math.abs(this.radius*Math.PI);
    }

    public double getPerimeter(){
        return Math.abs((this.radius*2)*Math.PI);
    }

    public static void grow(Circle circle){
        circle.radius += 1;
    }

    public int getCount(){
        return count;
    }

    public String toString(){
        return "X:\t" + getX() + "\nY:\t" + getY();
    }

}
