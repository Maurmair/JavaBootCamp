package chapter9Associations;

import java.util.Scanner;

public class HLGameApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(100);
        game.reset();
        System.out.print("Voer een getal tussen 0 en 100 in: ");
        int guessValue = keyboard.nextInt();
        while (game.guess(guessValue) !=0){
            if(game.guess(guessValue)==1){
                System.out.println("Lager");
                System.out.print("Voer een getal tussen 0 en 100 in: ");
                guessValue = keyboard.nextInt();
            } else if (game.guess(guessValue) == -1) {
                System.out.println("Hoger");
                System.out.print("Voer een getal tussen 0 en 100 in: ");
                guessValue = keyboard.nextInt();
            }
        }
        System.out.println("Done");
    }
}
