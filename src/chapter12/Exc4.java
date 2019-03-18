package chapter12;

import java.time.LocalDate;

public class Exc4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1988,8,29);
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
    }
}
