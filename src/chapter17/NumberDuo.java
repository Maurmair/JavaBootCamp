package chapter17;

public class NumberDuo<E extends Number> {
    private E first;
    private E second;

    public NumberDuo(final E first, final E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(final E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(final E second) {
        this.second = second;
    }

    public double getSum(){
        return first.doubleValue() + second.doubleValue();
    }
}
