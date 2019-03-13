package chapter5;

public class BmiUtility {
    public static float calculateBmi(final int weight, final int height) {
        float heightInM = (float) height/100;
        return weight/(heightInM*heightInM);
    }

    public static void printDiagnose(final float bmi){
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
    }
}
