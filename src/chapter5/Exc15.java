package chapter5;

import java.io.IOException;
import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) throws IOException {
        //        char c = (char) System.in.read();
//        String woord = "woord";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Voer een letter in: ");
        String woord = keyboard.next();


        int waarde = bepaalWaarde(woord);
        System.out.println(waarde);

    }
    public static int bepaalWaarde(final String woord){
        int value = 0;
        for (int i=0; i<woord.length();i++){
            switch (woord.charAt(i)){
            case 'a': value += 1; break;
            case 'b': value += 3; break;
            case 'c': value += 3; break;
            case 'd': value += 2; break;
            case 'e': value += 1; break;
            case 'f': value += 4; break;
            case 'g': value += 2; break;
            case 'h': value += 4; break;
            case 'i': value += 1; break;
            case 'j': value += 8; break;
            case 'k': value += 5; break;
            case 'l': value += 1; break;
            case 'm': value += 3; break;
            case 'n': value += 1; break;
            case 'o': value += 1; break;
            case 'p': value += 3; break;
            case 'q': value += 10; break;
            case 'r': value += 1; break;
            case 's': value += 1; break;
            case 't': value += 1; break;
            case 'u': value += 1; break;
            case 'v': value += 4; break;
            case 'w': value += 4; break;
            case 'x': value += 8; break;
            case 'y': value += 4; break;
            case 'z': value += 10; break;
            default: value += 0; break;
            }
        }
        return value;
    }
}
