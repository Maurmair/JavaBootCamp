package chapter20Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Exc2 {
    public static void main(String[] args) {
        Set<Integer> lottoTrekking = getLottoTrekking();
        Set<Integer> gebruikerCijfers = new LinkedHashSet<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voer zes unieke cijfers tussen de 0 en 46 in");
        while (gebruikerCijfers.size() <= 5) {
            int lottonummer = keyboard.nextInt();
            if (lottonummer > 0 && lottonummer < 46) {
                gebruikerCijfers.add(lottonummer);
            } else {
                System.out.println("Vekeerde input");
            }
        }
        gebruikerCijfers.retainAll(lottoTrekking);
        System.out.println("Aantal overeenkomstigheden: " + lottoTrekking.size());
        gebruikerCijfers.forEach(System.out::println);
    }

    private static Set<Integer> getLottoTrekking() {
        Set<Integer> lottoTrekking = new HashSet<>();
        IntStream intStream = new Random().ints(1, 45).distinct().limit(6);
        intStream.forEach(s -> lottoTrekking.add(s));
        lottoTrekking.forEach(System.out::println);
        return lottoTrekking;
    }

}
