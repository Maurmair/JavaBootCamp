package chapter10;

import chapter8.Rectangle;

public class Square extends Rectangle {
    private static int count = 0;
    public Square(){
        this(0);
    }

    public Square(int side) {
        super(side, side);
        count++;
    }

    public Square(int side, int x,  int y) {
        super(side, x, y, 0);
        count++;
    }
    public Square(Square square) {
        this.setSide(square.getSide());
        this.setHeight(square.getHeight());
        this.setWidth(square.getWidth());
        count++;
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    public void setHeight(int height) {
        setSide(height);
    }

    public void setWidth(int width) {
        setSide(width);
    }


    public String toString(String tempname){
        return "######## " + tempname +
                "\nHeight:\t" + getHeight() +
                "\nWidth:\t" + getWidth() +
                "\nSide:\t" + getSide()+
                "\nCount:\t" + getCount();
    }
}
