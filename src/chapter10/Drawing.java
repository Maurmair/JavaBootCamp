package chapter10;

public class Drawing {

    private Shape[] shapes = new Shape[100];
    private int size = 0;

    public Drawing(){

    }

    public void add(Shape shape){
        boolean overeenkomst = false;
        for (final Shape shape1 : shapes) {
            if (shape1 != null && shape1.equals(shape)){
                overeenkomst = true;
                break;
            }
        }
        if(!overeenkomst){
            voegInOpJuistePositie(shape, shapes);
            size++;
        }

    }

    public void remove(Shape shape){
//        for (Shape shape1 : shapes){
//            if ()
//        }
    }

    private void voegInOpJuistePositie(Shape s, Shape... shapes) {
        for (int i = 0; i <= shapes.length; i++) {
            if (shapes[i] == null){
                shapes[i] = s;
                break;
            }
        }
    }

    public void clear(){
        this.shapes = new Shape[100];
        this.size = 0;
    }

    public int getSize(){
        return size;
    }
}
