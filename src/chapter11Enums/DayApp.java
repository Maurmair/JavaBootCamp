package chapter11Enums;

import static chapter11Enums.Day.*;

public class DayApp {
    public static void main(String[] args) {
        Day[] week = {Day.MAANDAG, DINSDAG, Day.WOENSDAG, Day.DONDERDAG, Day.VRIJDAG, Day.ZATERDAG, Day.ZONDAG};
        for (Day dag : week){
            switch(dag){
                case MAANDAG:
                case DINSDAG:
                case WOENSDAG:
                case DONDERDAG:
                case VRIJDAG: dag.setWeekDay(dag, true); break;
                case ZATERDAG:
                case ZONDAG: dag.setWeekDay(dag, false); break;
                }
            System.out.println(dag.toString());
        }
    }
}

