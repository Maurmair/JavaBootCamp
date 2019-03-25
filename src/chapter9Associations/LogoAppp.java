package chapter9Associations;

import graphics.Circle;
import graphics.Rectangle;

public class LogoAppp {
    public static void main(String[] args) throws Exception{
        Rectangle r = new Rectangle(2,4,1,0);
        Circle c = new Circle(2,3,4);
        Logo logo = new Logo(r,c,"New Logo");
        System.out.println("Opp van logo is: " + logo.getArea());
    }
}
