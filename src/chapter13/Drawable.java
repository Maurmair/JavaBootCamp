package chapter13;

import javafx.scene.canvas.GraphicsContext;

public interface Drawable extends Scaleable{

    void draw(GraphicsContext g);
}
