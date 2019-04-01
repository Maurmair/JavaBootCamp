package chapter20Collections;

import java.util.Map;
import java.util.TreeMap;

public class PersonTreeMapApp {
    public static void main(String[] args) {
        Map<String, Person> personMap = new TreeMap<>();

        Person wes = new Person("Wes", "Maurmair", Gender.MALE, 30, 118, 184);
        Person nora = new Person("Nora", "Miessen", Gender.FEMALE, 26, 80, 175);
        Person joeri = new Person("Joeri", "Brinks", Gender.MALE, 29, 70, 175);
        Person renee = new Person("Renee", "Roth", Gender.FEMALE, 29, 65, 165);
        Person genderless = new Person("Gen", "DerLess", Gender.UNKNOWN, 29, 65, 165);
        Person genderlesss = new Person("Genn", "DerLesss", Gender.UNKNOWN, 29, 65, 165);
        personMap.put(wes.getFirstName(), wes);
        personMap.put(nora.getFirstName(), nora);
        personMap.put(joeri.getFirstName(), joeri);
        personMap.put(renee.getFirstName(), renee);
        personMap.put(genderless.getFirstName(), genderless);
        personMap.put(genderlesss.getFirstName(), genderlesss);
        //        personMap.keySet().forEach(System.out::println);
        //        System.out.println(personMap.toString());
        //        System.out.println(personMap.get("Wes"));
        System.out.println(((TreeMap<String, Person>) personMap).firstEntry());
        System.out.println(((TreeMap<String, Person>) personMap).lastEntry());
    }
}
