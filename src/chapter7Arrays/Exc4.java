package chapter7Arrays;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Voer één woord in: ");
        String woord = keyboard.nextLine();
        woord.toLowerCase();
        final int OFFSET = 97;
        int[] waardesPerLetter = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int waarde = 0;
        char[] charArray = woord.toCharArray();
        for (final char c : charArray) {
            waarde += waardesPerLetter[c-OFFSET];
        }
        System.out.println(waarde);
    }
}
