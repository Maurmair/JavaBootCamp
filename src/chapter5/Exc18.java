package chapter5;

public class Exc18 {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm) :");
        int height = KeyBoardUtility.readInt();
        System.out.println("Enter your weight (kg)");
        int weight = KeyBoardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight, height);
        BmiUtility.printDiagnose(bmi);
    }
}
