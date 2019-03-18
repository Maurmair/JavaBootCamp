package chapter11;

public enum Day {
    MAANDAG,
    DINSDAG,
    WOENSDAG,
    DONDERDAG,
    VRIJDAG,
    ZATERDAG,
    ZONDAG;

    private boolean weekDay;
    public String toString(){
        return name() + ": "  + "\tdoordeweekse dag: "+ weekDay + "\tordinal: " + ordinal();
    }

    public void setWeekDay(Day day, boolean waarde){
        day.weekDay = waarde;
    }

    public boolean isWeekDay(){
        return this.weekDay;
    }
}
