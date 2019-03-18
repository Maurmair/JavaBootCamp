package chapter9;

import chapter8.Circle;
import chapter8.Rectangle;

public class Logo {
    private Rectangle r;
    private Circle c;
    private String t;
    public Logo(Rectangle r, Circle c, String t){
        this.r = r;
        this.c = c;
        this.t = t;
    }

    public void setRectangle(Rectangle r) {
        this.r = r;
    }

    public Rectangle getRectangle(){
        return r;
    }

    public void setCircle(Circle c) {
        this.c = c;
    }

    public Circle getCircle(){
        return c;
    }

    public void setText(String t) {
        this.t = t;
    }

    public String getText(){
        return t;
    }

    public double getArea(){
        return r.getArea()+c.getArea();
    }

    public String toString(){
        return "Dit is een string";
    }

}
