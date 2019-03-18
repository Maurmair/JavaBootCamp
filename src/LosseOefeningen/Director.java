package LosseOefeningen;

public class Director extends PermanentWorker {
    private int procentAandelen;

    public Director(final int procentAandelen) {
        this.procentAandelen = procentAandelen;
    }

    public Director(final String naam, final int leeftijd, final int procentAandelen) {
        super(naam, leeftijd);
        this.procentAandelen = procentAandelen;
    }

    public int getProcentAandelen() {
        return procentAandelen;
    }

    public void setProcentAandelen(final int procentAandelen) {
        this.procentAandelen = procentAandelen;
    }
}
