package chapter20Collections;

import java.util.Comparator;

import chapter11Enums.Coin;

public class MuntTotaalComparator implements Comparator<Coin> {
    @Override
    public int compare(final Coin o1, final Coin o2) {
        return o1.getValue() - o2.getValue();
    }
}
