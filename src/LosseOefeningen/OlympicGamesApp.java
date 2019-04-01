package LosseOefeningen;

import java.util.HashMap;
import java.util.Map;

public class OlympicGamesApp {
    public static void main(String[] args) {
        Map<Integer, Map<Country, Integer>> olympicGames = new HashMap<>();
        Map<Country, Integer> olympicGameWinter2018 = new HashMap<>();
        olympicGameWinter2018.put(new Country("Norway"), 39);
        olympicGameWinter2018.put(new Country("Netherlands"), 20);
        olympicGameWinter2018.put(new Country("Belgium"), 1);
        olympicGameWinter2018.put(new Country("Portugal"), 1);
        olympicGames.put(2018, olympicGameWinter2018);

        Map<Country, Integer> olympicGameSummer2016 = new HashMap<>();
        olympicGameSummer2016.put(new Country("Netherlands"), 19);
        olympicGameSummer2016.put(new Country("Belgium"), 6);

        olympicGames.put(2016, olympicGameSummer2016);
        int totalMedals2016 = 0;
        int totalMedals2018 = 0;

        //Calculate total of medals per year
        //        - with and old-fashioned iteration
        for (final Map.Entry<Integer, Map<Country, Integer>> integerMapEntry : olympicGames.entrySet()) {
            int totyear = 0;
            for (final Map.Entry<Country, Integer> countryIntegerEntry : integerMapEntry.getValue().entrySet()) {
                totyear += countryIntegerEntry.getValue();
            }
            //            System.out.println(integerMapEntry.getKey() + ": " + totyear);
        }

        olympicGames.forEach((k, v) -> {
            final int[] a = { 0 };
            v.forEach((x, y) -> {
                a[0] += y;
            });
            //            System.out.println(k + ": \t" + a[0]);
        });

        Map<String, Integer> medalsPerCountry = new HashMap<>();
        olympicGames.forEach((k, v) -> {
            v.forEach((x, y) -> {
                medalsPerCountry.merge(x.getName(), y, (a, b) -> a + b);
            });
        });
        for (final Map.Entry<String, Integer> stringIntegerEntry : medalsPerCountry.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ":\t" + stringIntegerEntry.getValue());
        }
        /*

        3) Calculate total of medals per country (execOlympicMedalsWithForEach_44)

        4) Design your maps to facilitate counters per medal-type.

         */

    }

}
