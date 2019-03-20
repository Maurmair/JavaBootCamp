package chapter12SimpleClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        System.out.println("Voor een datum in (DD/MM/YYYY): ");
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.parse(scanner.nextLine(), dtf1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println(dtf1.format(now));
        System.out.println(dtf2.format(now));
    }
}
