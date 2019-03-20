package chapter8;

public class RectangleApp {
    public static void main(String[] args) throws Exception{
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.setHeight(5);
        rect.setWidth(2);
        rect.setX(0);
        rect.setY(10);
        printRectangleInfo(rect, "Rect");
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(2);
        rect1.setWidth(1);
        rect1.setX(9);
        rect1.setY(22);
        printRectangleInfo(rect1, "Rect1");
        Rectangle r2 = new Rectangle(3,4);
        printRectangleInfo(r2, "R2");
        Rectangle r3 = new Rectangle(4,9,20,10);
        printRectangleInfo(r3, "R3");
        Rectangle r4 = new Rectangle(r3);
        printRectangleInfo(r4, "R4");
        System.out.println("Aantal hoeken: " + Rectangle.getANGLES());

    }

    private static void printRectangleInfo(Rectangle rect, String name){
        System.out.println("###### "+ name + " ######");
        System.out.println("Hoogte: " + rect.getHeight());
        System.out.println("Breedte : " +rect.getWidth());
        System.out.println("Positie is: " + rect.getX() + ", " + rect.getY());
        System.out.println("Oppervlakte is : " + rect.getArea() + " vierkante meter");
        //        System.out.println("Omtrekt is: " + rect.getPerimiter()+ " meter");
//        System.out.println("Aantal gemaakte rechthoeken: "+Rectangle.getCount());
    }
}
