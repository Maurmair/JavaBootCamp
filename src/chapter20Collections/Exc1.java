package chapter20Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        //        eenTmVijf();
        Exc1 asolknd = new Exc1();
        //       rest();
        asolknd.rest();
    }

    private static void eenTmVijf() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Voer een getal in (1/3):\t");
        int getal1 = keyboard.nextInt();
        System.out.print("Voer een getal in (2/3):\t");
        int getal2 = keyboard.nextInt();
        System.out.print("Voer een getal in (3/3):\t");
        int getal3 = keyboard.nextInt();

        List<Integer> getallen = new LinkedList<>();
        getallen.add(getal1);
        getallen.add(getal2);
        getallen.add(getal3);
        getallen.forEach(System.out::println);

        int sommatie = getallen.stream().mapToInt(Integer::intValue).sum();
        OptionalDouble gemiddelde = getallen.stream().mapToInt(Integer::intValue).average();
        //        int som = 0;
        //
        //        for (final Integer integer : getallen) {
        //            som += integer;
        //        }
        //        double avg = som/getallen.size();
        System.out.println(sommatie);
        System.out.println(gemiddelde.getAsDouble());

        keyboard.close();
    }

    private void rest() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voer een zin in welke eindigt met een punt: ");
        boolean bevatPunt = false;
        List<String> zinAsList = new ArrayList<>();
        while (!bevatPunt) {
            String zin = keyboard.nextLine();
            if (zin.endsWith(".")) {
                bevatPunt = true;
                zinAsList.add(zin);
            } else {
            }
            System.out.println("Voer een zin in welke eindigt met een punt: ");
        }
        zinAsList.forEach(System.out::print);
        StringBuilder stringBuilder = new StringBuilder();

        zinAsList.forEach(System.out::println);
        for (final String s : zinAsList) {
            StringBuilder sb = new StringBuilder(s);
            stringBuilder.append(sb.reverse());
        }

        System.out.println(stringBuilder.toString());
        System.out.println(zinAsList.size());

        keyboard.close();
    }
}

