package chapter8;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a Circle");
        Circle c1 = new Circle();
        c1.setX(1);
        c1.setY(2);
        c1.setRadius(4);
        printCInfo(c1,"C1");
        Circle c2 = new Circle();
        c2.setY(-1);
        c2.setX(-2);
        c2.setRadius(-5);
        printCInfo(c2, "C2");
        Circle c3 = new Circle(3);
        printCInfo(c3, "C3");
        Circle c4 = new Circle(6,1,4);
        printCInfo(c4, "C4");
        Circle c5 = new Circle(c4);
        printCInfo(c5, "C5");
    }

    private static void printCInfo(final Circle c, final String name){
        System.out.println("###### "+ name + " ######");
        System.out.println("X is: " + c.getX());
        System.out.println("Y is: " + c.getY());
        System.out.println("Radius is: " + c.getRadius());
        System.out.println("Oppervlakte is : " + c.getArea() + " vierkante meter");
        System.out.println("Omtrekt is: " + c.getPerimiter()+ " meter");
        System.out.println("Aantal gemaakte circles: "+c.getCount());
    }
}
