package chapter6;

import java.util.Random;

public class Exc1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("Random nr.: "+rnd.nextLong());
        }
        System.out.println("################################");
        for(int i=0;i<10;i++){
            System.out.println("Random nr between 0 and 100: " + rnd.nextInt(100));
        }
        System.out.println("################################");
        for (int i = 0; i <=6; i++) {
            System.out.print(rnd.nextInt(45)+"\t");
        }
    }
}
