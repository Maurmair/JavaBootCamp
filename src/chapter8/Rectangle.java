package chapter8;

import chapter10.*;
import chapter13.Drawable;

public class Rectangle extends Shape implements Drawable {
    private static final int ANGLES = 4;

    public static int getANGLES() {
        return ANGLES;
    }

    public static int count = 0;
    private int height;
    private int width;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int height, int width){
        this(Math.abs(height),Math.abs(width),0,0);
    }

    public Rectangle(int height, int width, int x, int y){
        setX(x);
        setY(y);
        this.height = Math.abs(height);
        this.width = Math.abs(width);
        count++;
    }

    public Rectangle(Rectangle bron) {
        this.width = bron.getWidth();
        this.height= bron.getHeight();
        count++;
    }
    public void grow(int d){

    }
    public double getArea(){
        return Math.abs(this.height*this.width);
    }

    public double getPerimeter(){
        return Math.abs((this.height*2)+(this.width*2));
    }

    public int getHeight() {
        return Math.abs(height);
    }

    public void setHeight(final int height) {
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return Math.abs(width);
    }

    public void setWidth(final int width) {
        this.width = Math.abs(width);
    }

    public String toString(){
        return "X:\t" + getX() + "\tY:\t" + getY() +"\tWidth: \t" + width + "\tHeight: \t" + height;
    }

    @Override
    public void scale(final int factor) {
        setWidth(width*factor);
        setHeight(height*factor);
    }
}
