package chapter12;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exc5 {
    public static void main(String[] args) {

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Australia/Adelaide")));
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC")).minusHours(4));
    }
}
