package chapter20Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerOrderApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> queue = new PriorityQueue<>();
        queue.offer(new BurgerOrder("NeutralBurger", 300));
        queue.offer(new BurgerOrder("HappyBurger", 100));
        queue.offer(new BurgerOrder("SadBurger", 200));

        BurgerOrder s = queue.peek();
        while (s != null) {
            System.out.println("About to handle " + s);
            s = queue.poll();
            System.out.println("Handling " + s);
            s = queue.peek();
        }
    }
}
