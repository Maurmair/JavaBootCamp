package chapter20Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonApp {

    public static void main(String[] args) {

        /* ANNONIEME KLASSE COMPARATOR
            new Comparator<Person>(){
            public int compare(Person persoonEen, Person persoonTwee) {
                return ((Float) persoonEen.getWeight()).compareTo((Float) persoonTwee.getWeight());
                 }
            }
         */

        /*  LAMBDA
            Comparator.comparingDouble(Person::getWeight)
         */
        Set<Person> personen = new TreeSet<>();
        Person wes = new Person("Wes", "Maurmair", Gender.MALE, 30, 118, 184);
        Person nora = new Person("Nora", "Miessen", Gender.FEMALE, 26, 80, 175);
        Person joeri = new Person("Joeri", "Brinks", Gender.MALE, 29, 70, 175);
        Person renee = new Person("Renee", "Roth", Gender.FEMALE, 29, 65, 165);
        Person genderless = new Person("Gen", "DerLess", Gender.UNKNOWN, 29, 65, 165);
        Person genderlesss = new Person("Gen", "DerLess", Gender.UNKNOWN, 29, 65, 165);
        personen.add(wes);
        personen.add(nora);
        personen.add(joeri);
        personen.add(renee);
        personen.add(genderless);
        personen.add(genderlesss);
        //        personen.forEach(System.out::println);

        List<Person> personList = new ArrayList<>();
        personList.add(wes);
        personList.add(nora);
        personList.add(joeri);
        personList.add(renee);
        personList.add(genderless);
        personList.add(genderlesss);
        List<Person> filteredPersonList =
                personList.stream().filter(person -> person.getGender().equals(Gender.FEMALE) && person.getAge() >= 20)
                          .sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        filteredPersonList.forEach(System.out::println);
    }

}
