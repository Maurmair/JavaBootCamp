package chapter10;

import chapter13.Drawable;
import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Drawable {
    private int x;
    private int y;
    private static int count = 0;

    public Shape(){

    }

    public Shape(int x, int y) {
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = Math.abs(x);
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = Math.abs(y);
    }

    public void setPosition(int x, int y){
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public int getCount(){
        return this.count;
    }

    @Override
    public void draw(final GraphicsContext g) {

    }
}
