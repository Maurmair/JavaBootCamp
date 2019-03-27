package graphics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javafx.scene.canvas.GraphicsContext;

public class Drawing implements Drawable {

    private Collection<Drawable> shapes = new ArrayList<>();
    private int size = 0;

    public Drawing(){

    }

    public void remove(Drawable d) {
        Iterator<Drawable> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            if (iterator.equals(d)) {
                iterator.remove();
                break;
            }
        }
    }

    public Collection<Drawable> getShapes() {
        return shapes;
    }

    public void add(Drawable d) {
        shapes.add(d);
        size++;
    }

    public void clear(){
        this.shapes = new ArrayList<>();
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

}
