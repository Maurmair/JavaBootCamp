package chapter5JavaProgrameertaal;

import java.util.Scanner;

public class Exc15A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = 0;
        System.out.print("Voer het nummer van de maand in\t\t:");
        int maand = input.nextInt();
        if (maand > 12 || maand <= 0){
            System.out.println("Foutieve uitvoer");
        } else {
            switch (maand) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = 0;
            }
            System.out.println("Aantal dagen in maand: "+days);
        }
    }
}
