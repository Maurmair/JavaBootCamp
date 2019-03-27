package chapter20Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exc6 {
    public static void main(String[] args) {
        Deque<Person> personen = new ArrayDeque<>();
        personen.offerFirst(new Person("Wes", "Maurmair", Gender.MALE, 30, 120, 184));
        personen.offerLast(new Person("Nora", "Miessen", Gender.FEMALE, 26, 85, 185));
        personen.offerFirst(new Person("Joeri", "Brinks", Gender.MALE, 29, 70, 170));
        personen.offerFirst(new Person("Han", "Welzen", Gender.MALE, 45, 60, 160));
        personen.offerLast(new Person("Renee", "Roth", Gender.FEMALE, 29, 65, 165));
        personen.offerLast(new Person("Romane", "Goldmuntz", Gender.FEMALE, 29, 65, 165));
        while (!personen.isEmpty()) {
            System.out.println("Man: " + personen.pollFirst());
            System.out.println("Vrouw: " + personen.pollLast());
        }
    }
}
