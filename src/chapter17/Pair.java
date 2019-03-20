package chapter17;

public interface Pair<E> {
    E getLeft();

    void setLeft(E left);

    E getRight();

    void setRight(E right);

    default void swap(){
        E temp = getLeft();
        setLeft(getRight());
        setRight(temp);
    }
}
