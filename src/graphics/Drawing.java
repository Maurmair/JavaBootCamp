package graphics;

import java.util.Iterator;
import java.util.function.Consumer;

import javafx.scene.canvas.GraphicsContext;

public class Drawing implements Drawable, Iterable{

    private Drawable[] shapes = new Drawable[100];
    private int size = 0;

    public Drawing(){

    }

    public void add(Drawable d){
        boolean overeenkomst = false;
        for (final Drawable shape1 : shapes) {
            if (shape1 != null && shape1.equals(d)){
                overeenkomst = true;
                break;
            }
        }
        if(!overeenkomst){
            voegInOpJuistePositie(d, shapes);
            size++;
        }

    }

    public void remove(Drawable d){
//        for (Shape shape1 : shapes){
//            if ()
//        }
    }

    private void voegInOpJuistePositie(Drawable d, Drawable... shapes) {
        for (int i = 0; i <= shapes.length; i++) {
            if (shapes[i] == null){
                shapes[i] = d;
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

    @Override
    public void draw(final GraphicsContext g) {

    }

    @Override
    public void scale(final int factor) {
        for (final Drawable shape : shapes) {
            if (shape != null){
                shape.scale(factor);
            }
        }
    }

    public String toString(){
        StringBuilder sB = new StringBuilder();
        for (final Drawable shape : shapes) {
            if (shape != null){
                sB.append(shape.toString()+"\n");
            }
        }
        return sB.toString();
    }

    class DrawableIterator implements Iterator{
        private int position = 0;
        @Override
        public boolean hasNext() {
            return position < shapes.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return shapes[position++];
            } else {
                return null;
            }
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(final Consumer action) {

        }
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }
}
