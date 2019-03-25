package graphics;

public interface Scaleable {
    int DOUBLE = 200;
    int HALF = 50;
    int QUARTER = 25;

    void scale(int factor);
    default void scaleDouble(){
        scale(DOUBLE);
    }

    default void scaleHalf(){
        scale(HALF);
    }
}
