package chapter19Streams;

import java.util.Random;
import java.util.stream.IntStream;

public class Exc4 {
    public static void main(String[] args) {
        //        een();
        twee();
    }

    private static void twee() {

        /*
        Maak een programma dat  500 willekeurige, even en unieke getallen genereert tussen 0 en 10.000
        Sorteer de getallen en maak er een array van.
        Hint: Zoek in de klasse Random naar een manier om een stream van willekeure getallen te genereren.
         */

        IntStream intStream = new Random()
                .ints(0, 10000)
                .distinct()
                .filter(s -> s % 2 == 0)
                .limit(500)
                .sorted();
        intStream.forEach(System.out::println);

    }

    private static void een() {
        /*
            Maak een programma dat het volgende berekent: De som van de vierkantswortels van de eerste
            twintig getallen tussen de 0 en 1000 die deelbaar zijn door 5 en 8
         */
        double somm = 0D;
        IntStream intStream = IntStream.rangeClosed(0, 1000).filter(s -> s % 5 == 0 && s % 8 == 0).limit(20);
        int[] rij = intStream.toArray();
        for (final int i : rij) {
            somm += Math.sqrt(i);
        }
        System.out.println(somm);
    }
}
