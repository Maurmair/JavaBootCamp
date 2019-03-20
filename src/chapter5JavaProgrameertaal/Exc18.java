package chapter5JavaProgrameertaal;

public class Exc18 {
    public static void main(String[] args) {
        KeyBoardUtilityImpl kImp = new KeyBoardUtilityImpl();
        BmiUtilityImpl bImp = new BmiUtilityImpl();
        System.out.println("Enter your length (cm) :");
        int height = kImp.readInt();
        System.out.println("Enter your weight (kg)");
        int weight = kImp.readInt();
        float bmi = bImp.calculateBmi(weight, height);
        bImp.printDiagnose(bmi);
    }
}
