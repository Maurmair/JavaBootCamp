package chapter10InheritanceAndClassHirarchy;

public class SquareApp {
    public static void main(String[] args) throws Exception{
        Square sq1 = new Square();
        System.out.println(sq1.toString("Een"));
        Square sq2 = new Square(2);
        System.out.println(sq2.toString("Twee"));
        Square sq3 = new Square(3,4,7);
        System.out.println(sq3.toString("Drie"));
        Square sq4 = new Square(sq3);
        System.out.println(sq4.toString("Vier"));


//        sq.setPosition(2,5);
//        sq.setSide(-4);
//        System.out.println("Side: " + sq.getSide());
//        sq.setHeight(5);
//        System.out.println(sq.getArea());
//        System.out.println(sq.getPerimiter());
//        System.out.println("x: " + sq.getX()+ ", y: " +sq.getY());
//        System.out.println(sq.getWidth());
    }

}
