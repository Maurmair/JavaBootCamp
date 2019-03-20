package chapter13Interfaces;

import javafx.scene.canvas.GraphicsContext;

public interface Drawable extends Scaleable{

    void draw(GraphicsContext g);
}
