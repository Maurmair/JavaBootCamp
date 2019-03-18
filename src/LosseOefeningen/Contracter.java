package LosseOefeningen;

public class Contracter extends Worker {

    public Contracter() {
    }

    public Contracter(final String naam) {
        super(naam);
    }

    public Contracter(final String naam, final int leeftijd) {
        super(naam, leeftijd);
    }

    public Contracter(final String naam, final int leeftijd, final String datumInDienst) {
        super(naam, leeftijd, datumInDienst);
    }

    public Contracter(final String naam, final int leeftijd, final String datumInDienst, final int salaris) {
        super(naam, leeftijd, datumInDienst, salaris);
    }
}
