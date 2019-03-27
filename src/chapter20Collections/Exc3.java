package chapter20Collections;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Exc3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voer een aantal woorden in: ");
        NavigableSet<String> woorden = new TreeSet<>();
        for (String woord : keyboard.nextLine().split(" ")) {
            woorden.add(woord.toLowerCase());
        }
        woorden.forEach(System.out::println);
        System.out.println(woorden.pollFirst());
        System.out.println(woorden.pollLast());
    }
}
