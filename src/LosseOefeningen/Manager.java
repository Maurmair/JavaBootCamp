package LosseOefeningen;

public class Manager extends PermanentWorker {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(final int bonus) {
        this.bonus = bonus;
    }

    public Manager(final int bonus) {
        this.bonus = bonus;
    }

    public Manager(final String naam, final int leeftijd, final int bonus) {
        super(naam, leeftijd);
        this.bonus = bonus;
    }
}
