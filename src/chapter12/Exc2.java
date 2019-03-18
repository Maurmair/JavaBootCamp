package chapter12;

import java.time.Instant;

public class Exc2 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.plusSeconds(7).plusMillis(5).plusNanos(3));
    }
}
