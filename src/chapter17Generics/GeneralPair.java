package chapter17Generics;

public class GeneralPair<E> implements Pair<E> {
    private E left;
    private E right;

    public GeneralPair(final E left, final E right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public E getLeft() {
        return left;
    }

    @Override
    public void setLeft(final E left) {
        this.left = left;
    }

    @Override
    public E getRight() {
        return right;
    }

    @Override
    public void setRight(final E right) {
        this.right = right;
    }
}
