package chapter12;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        System.out.println("Voer een dag in (1-7)");
        Scanner scanner = new Scanner(System.in);
        int dag = scanner.nextInt();
        System.out.println(DayOfWeek.of(dag));
        System.out.println(DayOfWeek.of(dag).plus(2L));
    }
}
