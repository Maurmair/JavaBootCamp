package chapter12;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exc6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1988,8,29);
        Period period = Period.between(then, now);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        long days = Math.abs(ChronoUnit.DAYS.between(now, then));
        System.out.println(days);
        long weeks = Math.abs(ChronoUnit.WEEKS.between(now,then));
        System.out.println(weeks);
        long monts = Math.abs(ChronoUnit.MONTHS.between(now, then));
        System.out.println(monts);
    }
}
