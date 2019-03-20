package chapter10InheritanceAndClassHirarchy;

import chapter8ClassDefenition.Rectangle;

public class Square extends Rectangle {
    private static int count = 0;
    public Square() throws Exception {
        this(0);
    }

    public Square(int side) throws Exception{
        super(side, side);
        count++;
    }

    public Square(int side, int x,  int y) throws Exception {
        super(side, x, y, 0);
        count++;
    }
    public Square(Square square) throws Exception{
        this.setSide(square.getSide());
        this.setHeight(square.getHeight());
        this.setWidth(square.getWidth());
        count++;
    }

    public void setSide(int side) throws Exception{
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    public void setHeight(int height) throws Exception{
        setSide(height);
    }

    public void setWidth(int width) throws Exception {
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
