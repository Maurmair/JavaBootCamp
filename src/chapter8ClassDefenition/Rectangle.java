package chapter8ClassDefenition;

import chapter10InheritanceAndClassHirarchy.Shape;
import chapter13Interfaces.Drawable;

/**
 * {@Link Rectangle} Object
 * subclass of {@Link Shape}
 * uses the {@Link Drawable} interface
 */
public class Rectangle extends Shape implements Drawable {
    private static final int ANGLES = 4;

    public static int getANGLES() {
        return ANGLES;
    }

    public static int count = 0;
    private int height;
    private int width;

    /**
     * Default constructor
     * @throws Exception
     */
    public Rectangle()throws Exception{
        this(0,0);
    }

    /**
     *
     * @param height
     * @param width
     * @throws Exception
     */
    public Rectangle (int height, int width)throws Exception{
        this(Math.abs(height),Math.abs(width),0,0);
    }

    /**
     *
     * @param height
     * @param width
     * @param x
     * @param y
     * @throws Exception
     */
    public Rectangle(int height, int width, int x, int y) throws Exception{
        try{
            setX(x);
            setY(y);
            this.height = Math.abs(height);
            this.width = Math.abs(width);
            count++;
        } catch (Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }

    }

    /**
     *
     * @param bron
     */
    public Rectangle(Rectangle bron) {
        this.width = bron.getWidth();
        this.height= bron.getHeight();
        count++;
    }

    /**
     *
     * @param d factor to grow {@Link Rectangle} with
     */
    public void grow(int d){

    }

    /**
     *
     * @return Oppervlakte
     */
    public double getArea(){
        return Math.abs(this.height*this.width);
    }

    /**
     *
     * @return Omtrek
     */
    public double getPerimeter(){
        return Math.abs((this.height*2)+(this.width*2));
    }

    public int getHeight() {
        return Math.abs(height);
    }

    /**
     *
     * @param height
     * @throws Exception voor negatief getal
     */
    public void setHeight(final int height) throws Exception{
        if (height<0) {
            throw new Exception("Negative height");
        } else {
            this.height = height;
        }
    }

    public int getWidth() {
        return Math.abs(width);
    }

    public void setWidth(final int width) throws Exception{
        if (width<0) {
            throw new Exception("Negative width");
        } else {
            this.width = width;
        }
    }

    public String toString(){
        return "X:\t" + getX() + "\tY:\t" + getY() +"\tWidth: \t" + width + "\tHeight: \t" + height;
    }

    /**
     *
     * @param factor
     */
    @Override
    public void scale(final int factor)  {
            try {
                setWidth(width*factor);
                setHeight(height*factor);
            } catch (Exception e){
                System.out.println(e);
            }


    }
}
