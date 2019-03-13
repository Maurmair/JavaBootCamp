package chapter5;

import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {
        een();
        twee();
        drie();
        vier();
        vijf();
        System.out.println("Klaar");
    }

    private static void een(){
        printDeel(1);
        int i = 120;
        while (i>=100){
            System.out.println(i);
            i--;
        }
    }
    private static void twee(){
        printNewLine();
        printDeel(2);
        System.out.println("###### 2");
        int i = 50;
        while (i>=0){
            if (i%3 == 0){
                System.out.println(i);
            }
            i--;
        }
    }
    private static void drie(){
        printNewLine();
        printDeel(3);
        int a = 1;
        int b = 0;
        while (b<=10000){
            b = (int)Math.pow(a,5);
            if (b<=10000){
                System.out.println((int)Math.pow(a,5));
                a++;
            }
        }

    }
    private static void vier(){
        printNewLine();
        printDeel(4);
        int i = 65;
        while (i<=90){
            System.out.println((char)(i));
            i++;
        }
    }
    private static void vijf(){
        printNewLine();
        printDeel(5);
        Scanner keyboard = new Scanner(System.in);
        boolean juisteInput = false;
        while (!juisteInput){
            System.out.println("Voer een cijfer tussen de 0 en de 10 in: ");
            int i = keyboard.nextInt();
            if (i>0 && i<10){
                juisteInput = true;
                System.out.println("Juiste input");
                break;
            } else {
                System.out.println("Voer een cijfer tussen de 0 en de 10 in: ");
            }
//            juisteInput = (keyboard.nextInt() >=0 && keyboard.nextInt() <= 10?true:false);
        }
    }
    private static void printNewLine(){
        System.out.println("\n");
    }
    private static void printDeel(int i){
        System.out.println("###### "+i);
    }
}
