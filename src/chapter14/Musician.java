package chapter14;

public class Musician {

    public void play() {
        Instrument obj2 = new Instrument() {
            @Override
            public void makeSound() {
                System.out.println("random geluid");
            }

            //        class Instrument{
            //            public void makeSound(){
            //                System.out.println("Makes a sound");
            //            }
            //        }
            //        Instrument instrument = new Instrument();
            //        instrument.makeSound();
        };
        obj2.makeSound();
    }
}
