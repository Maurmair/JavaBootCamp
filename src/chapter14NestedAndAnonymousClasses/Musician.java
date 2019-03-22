package chapter14NestedAndAnonymousClasses;

public class Musician {

    public void play() {
        Instrument obj2 = new Instrument() {
            @Override
            public void makeSound() {
                System.out.println("random geluid");
            }
        };
        obj2.makeSound();
    }
}
