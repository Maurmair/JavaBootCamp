package chapter20Collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private float weight;
    private float height;

    public Person(final String firstName, final String lastName, final Gender gender, final int age, final float weight,
                  final float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(final float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(final float height) {
        this.height = height;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        final Person person = (Person) o;
        return getAge() == person.getAge() && Float.compare(person.getWeight(), getWeight()) == 0
                && Float.compare(person.getHeight(), getHeight()) == 0 && getFirstName().equals(person.getFirstName()) && getLastName()
                .equals(person.getLastName()) && getGender() == person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGender(), getAge(), getWeight(), getHeight());
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender=" + gender + ", age=" + age
                + ", weight=" + weight + ", height=" + height + '}';
    }

    @Override
    public int compareTo(final Person persoon) {
        return this.lastName.toLowerCase().compareTo(persoon.lastName.toLowerCase());
    }
}
