package graphics;

/**
 * App for creating a {@Link Drawing} object and filling it with a list of {@LinkShapes}
 */
public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle(1,2,3));
//        drawing.add(new Rectangle(4,5,6,7));
        drawing.add(new Circle(1,2,3));
//        drawing.add(new Rectangle(4,5,6,7));
//        System.out.println(drawing.getSize());
//        drawing.clear();
//        System.out.println(drawing.getSize());

//        for (Object s: drawing){
//            System.out.println(s.toString());
//        }
        drawing.getShapes().forEach(System.out::println);
    }
}
