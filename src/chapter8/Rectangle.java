package chapter8;

public class Rectangle {
    private static final int ANGLES = 4;

    public static int getCount() {
        return count;
    }

    public static int getANGLES() {
        return ANGLES;
    }

    public static int count = 0;
    private int height;
    private int width;
    private int x;
    private int y;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int height, int width){
        this(Math.abs(height),Math.abs(width),0,0);
//        this.height = Math.abs(height);
//        this.width = Math.abs(width);
    }

    public Rectangle(int height, int width, int x, int y){
        this.height = Math.abs(height);
        this.width = Math.abs(width);
        this.x = Math.abs(x);
        this.y = Math.abs(y);
        count++;
    }

    public Rectangle(Rectangle bron) {
        this.width = bron.getWidth();
        this.height= bron.getHeight();
        this.x = bron.getX();
        this.y= bron.getY();
        count++;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void grow(int d){
        this.x += d;
        this.y += d;

    }
    public double getArea(){
        return Math.abs(this.height*this.width);
    }

    public double getPerimiter(){
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

    public int getX() {
        return Math.abs(x);
    }

    public void setX(final int x) {
        this.x = Math.abs(x);
    }

    public int getY() {
        return Math.abs(y);
    }

    public void setY(final int y) {
        this.y = Math.abs(y);
    }

}
