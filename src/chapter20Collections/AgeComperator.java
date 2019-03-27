package chapter20Collections;

import java.util.Comparator;

public class AgeComperator implements Comparator<Person> {

    @Override
    public int compare(final Person persoonEen, final Person persoonTwee) {
        return persoonEen.getAge() - persoonTwee.getAge();
    }
}
