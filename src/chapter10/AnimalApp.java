package chapter10;

public class AnimalApp {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat("James");

        printInfo(catOne, catTwo);

        Fish fishOne = new Fish();
        Fish fishTwo = new Fish("Goldie");

        printInfo(fishOne, fishTwo);

        Bird birdOne = new Bird();
        Bird birdTwo = new Bird("Speedy");

        printInfo(birdOne, birdTwo);

        Snake snakeOne = new Snake();
        Snake snakeTwo = new Snake("Snape");

        printInfo(snakeOne, snakeTwo);


    }

    private static void printInfo(final Animal catOne, final Animal catTwo) {
        System.out.println(catOne.getName());
        catOne.move();
        catOne.makeNoise();
        System.out.println(catTwo.getName());
        catTwo.move();
        catTwo.makeNoise();
    }
}
