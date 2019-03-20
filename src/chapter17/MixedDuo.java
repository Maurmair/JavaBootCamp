package chapter17;

public class MixedDuo<E1, E2> {
    private E1 first;
    private E2 second;

    public MixedDuo(final E1 first, final E2 second) {
        this.first = first;
        this.second = second;
    }

    public E1 getFirst() {
        return first;
    }

    public void setFirst(final E1 first) {
        this.first = first;
    }

    public E2 getSecond() {
        return second;
    }

    public void setSecond(final E2 second) {
        this.second = second;
    }
}
