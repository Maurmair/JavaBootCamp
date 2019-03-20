package chapter11Enums;

public class CoinApp {
    public static void main(String[] args) {
        float som = 0;
        Coin[] centen = {Coin.ONE_CENT, Coin.TWO_CENT, Coin.TWO_EURO};
        for (final Coin coin : centen) {
            som += coin.getValue();
        }
        System.out.println("Euros: "+ som/100);
    }
}
