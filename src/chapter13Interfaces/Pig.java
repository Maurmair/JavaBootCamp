package chapter13Interfaces;

public interface Pig {
    public void grunt();
    public default void fly(){
        System.out.println("Flies away");
    }
}
