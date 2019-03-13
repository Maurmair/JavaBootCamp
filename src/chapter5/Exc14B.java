package chapter5;

import java.util.Scanner;

public class Exc14B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wat is uw gewicht? ");
        double gewicht = input.nextDouble();
        System.out.println("Wat is uw lengte? (IN METER MET KOMMAGETAL)");
        double lengteInM = input.nextDouble();
        double bmi = gewicht/(lengteInM*lengteInM);
        System.out.println("Uw BMI is: \t\t" + bmi);
        if (bmi>40) {
            System.out.println("u heeft ziekelijk overgewicht");
        } else if (bmi>=30) {
            System.out.println("u heeft obesitas");
        } else if (bmi>=25){
            System.out.println("u heeft overgewicht");
        } else if (bmi>=20){
            System.out.println("ok");
        } else if (bmi<20){
            System.out.println("Ondergewicht");
        }
//        gewicht/(lengte*lenteInMeter)
    }
}
