package chapter8;

public class Circle {
    public static final int ANGLES = 0;
    private static int count = 0;
    private int x;
    private int y;
    private int radius;

    public Circle(){
        this(0);
    }
    public Circle(final int radius){
        this(Math.abs(radius),0,0);
    }
    public Circle(final int radius, final int x, final int y){
        this.radius = Math.abs(radius);
        this.x = Math.abs(x);
        this.y = Math.abs(y);
        count++;
    }

    public Circle(final Circle circle){
        this.x = circle.getX();
        this.y = circle.getY();
        this.radius = Math.abs(circle.getRadius());
        count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public double getPerimiter(){
        return Math.abs((this.radius*2)*Math.PI);
    }

    public static void grow(Circle circle){
        circle.radius += 1;
    }

    public int getCount(){
        return count;
    }


}
