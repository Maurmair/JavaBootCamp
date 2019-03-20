package chapter10InheritanceAndClassHirarchy;

import chapter13Interfaces.Drawable;

public class Triangle extends Shape implements Drawable {
    private final static int ANGLES = 3;
    private static int count = 0;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle(){
        this(0,0,0);
    }

    public Triangle(int w, int h, int p){
        this(w,h,p,0,0);
    }

    public Triangle(int w, int h, int p, int x, int y){
        this.width = Math.abs(w);
        this.height = Math.abs(h);
        this.perpendicular = Math.abs(p);
        this.setX(Math.abs(x));
        this.setY(Math.abs(y));
        count++;
    }

    public Triangle(Triangle triangle) {
        this.width = triangle.getWidth();
        this.height = triangle.getHeight();
        this.perpendicular = triangle.getPerpendicular();
        this.setX(triangle.getX());
        this.setY(triangle.getY());
        count++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(final int perpendicular) {
        this.perpendicular = perpendicular;
    }

    public double getArea(){
        return (1/2)*width*height;
    }

    public double getPerimeter(){
        return 0D;
    }

    public String toString(){
        return "Height:\t" +height + "\nWidth:\t" + width + "\nPerpendicular:\t"+perpendicular;
    }

    @Override
    public void scale(final int factor) {

    }
}
