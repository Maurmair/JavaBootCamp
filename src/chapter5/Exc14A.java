package chapter5;

import java.util.Scanner;

public class Exc14A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean klaar = false;
        System.out.print("Hoe oud bent u?\t");
        int leeftijd = keyboard.nextInt();
        System.out.println("U bent een: \t" + (leeftijd>=18?"Volwassene":(leeftijd>=10?"Tiener":(leeftijd>=2?"Kind":"Baby"))));
    }
}
