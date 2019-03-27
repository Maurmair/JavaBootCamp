package chapter20Collections;

import java.util.Objects;

public class BurgerOrder implements Comparable<BurgerOrder> {

    private String name;
    private int number;

    public BurgerOrder(final String name, final int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BurgerOrder)) {
            return false;
        }
        final BurgerOrder that = (BurgerOrder) o;
        return getNumber() == that.getNumber() && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "name='" + name + '\'' + ", number=" + number + '}';
    }

    @Override
    public int compareTo(final BurgerOrder burgerOrder) {
        return this.number - burgerOrder.number;
    }
}
