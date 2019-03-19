package chapter13;

public interface Scaleable {
    int DOUBLE = 200;
    int HALF = 50;
    int QUARTER = 25;

    void scale(int factor);
    public default void scaleDouble(){
        scale(DOUBLE);
    }

    public default void scaleHalf(){
        scale(HALF);
    }
}
