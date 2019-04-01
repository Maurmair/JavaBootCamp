package chapter20Collections;

import java.util.HashMap;
import java.util.Map;

import chapter11Enums.Coin;

public class CoinApp {
    final static int HONDERD = 100;

    public static void main(String[] args) {
        Map<Coin, Integer> beurs = new HashMap<>();
        beurs.put(Coin.TWO_EURO, 50);
        beurs.put(Coin.ONE_EURO, 100);
        beurs.put(Coin.FIFTY_CENT, 200);
        int sommatie = 0;
        beurs.forEach((k, v) -> System.out.println(k + ": " + v));
        for (final Map.Entry<Coin, Integer> coinIntegerEntry : beurs.entrySet()) {
            sommatie += coinIntegerEntry.getValue() * coinIntegerEntry.getKey().getValue();
        }
        System.out.println("Beursinhoud: " + sommatie / HONDERD + " euro's");

    }
}
