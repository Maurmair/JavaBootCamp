package chapter12;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        Integer i = Integer.parseInt(input);
        i+=5;
        System.out.println(i);

//        System.out.println(Integer.BYTES(i));
    }
}
