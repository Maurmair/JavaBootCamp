package chapter19Streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exc1 {
    public static void main(String[] args) {
        //        one();
        //        two();
        three();
        //        four();
    }

    private static void three() {
        Person wes = new Person("Wes", "Maurmair", Geslacht.MAN, 30, 118, 184);
        Person joerie = new Person("Joeri", "Brinks", Geslacht.MAN, 29, 70, 175);
        Person han = new Person("Han", "Welzen", Geslacht.MAN, 45, 60, 160);
        Person nora = new Person("Nora", "Miessen", Geslacht.VROUW, 26, 70, 177);
        Person genderless = new Person("Gen", "DerLess", Geslacht.ONBEPAALD, 20, 90, 190);

        Person[] personen = { wes, joerie, han, nora, genderless };

        Stream<Person> personStream = Stream.of(personen);
        Stream<Person> personStreamWomenOnly = Stream.of(personen).filter(s -> s.getGeslacht().equals(Geslacht.VROUW));
        Stream<Person> personStreamOlderThen30 = Stream.of(personen).filter(s -> s.getLeeftijd() >= 30);
        Stream<Person> personStreamBetween50And80Kg =
                Stream.of(personen).filter(s -> s.getGewicht() >= 50).filter(s -> s.getGewicht() <= 80);
        Stream<Person> personStreamOlderThen25HeavierThen90KG =
                Stream.of(personen).filter(s -> s.getGewicht() >= 90).filter(s -> s.getLeeftijd() >= 25);
        IntStream intStream = Stream.of(personen).mapToInt(s -> s.getLeeftijd());

        // ######################## VOOR EN ACHTERNAAM
        List<String> namen =
                Stream.of(personen).map(persoon -> persoon.getVoornaam() + " " + persoon.getAchternaam()).collect(Collectors.toList());


        // ######################## AVG MIN MAX Leeftijden
        OptionalDouble avg = Stream.of(personen)
                                   .mapToInt(persoon -> persoon.getLeeftijd()).average();
        OptionalInt min = Stream.of(personen)
                                .mapToInt(persoon -> persoon.getLeeftijd()).min();
        OptionalInt max = Stream.of(personen)
                                .mapToInt(persoon -> persoon.getLeeftijd()).max();
//        System.out.println(avg.getAsDouble() + " " + min.getAsInt() + " " + max.getAsInt());

        // ######################## GEWICHT VAN IEDER PERSOON
        DoubleStream doubleStream = Stream
                .of(personen)
                .mapToDouble(persoon -> persoon.getGewicht());
//        doubleStream.forEach(System.out::println);

        // ######################## AVG MIN MAX GEWICHT
        OptionalDouble avgWeight = Stream
                .of(personen)
                .mapToDouble(persoon -> persoon.getGewicht())
                .average();

        OptionalDouble minWeight = Stream
                .of(personen)
                .mapToDouble(s -> s.getGewicht())
                .min();

        OptionalDouble maxWeight = Stream
                .of(personen)
                .mapToDouble(s -> s.getGewicht())
                .max();
                System.out.println(avgWeight.getAsDouble() + " " + minWeight + " " + maxWeight);

        // ######################## OUDE SOUTS
        //        Person[] ppls = Stream.of(personen).toArray(Person[]::new);
        //        personStream.forEach(System.out::println);
        //        personStreamWomenOnly.forEach(System.out::println);
        //        personStreamOlderThen30.forEach(System.out::println);
        //        personStreamBetween50And80Kg.forEach(System.out::println);
        //        personStreamOlderThen25HeavierThen90KG.forEach(System.out::println);
        //        intStream.forEach(System.out::println);
        //        namen.forEach(System.out::println);
    }

    private static void two() {
        IntStream ints = IntStream.rangeClosed(0, 99);
        ints.forEach(System.out::println);
    }

    private static void one() {
        String[] words = { "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog" };
        Stream<String> stream = Stream.of(words);
        stream.forEach(System.out::println);
    }
}
