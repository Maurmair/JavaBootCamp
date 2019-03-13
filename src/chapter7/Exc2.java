package chapter7;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voer een zin als tekst in:");
        String text = keyboard.nextLine();
        String[] split = text.split(" ");
        for (final String s : split) {
            System.out.println(s);
        }
    }
}
