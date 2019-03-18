package LosseOefeningen;

public abstract class Worker {
    private String naam;
    private int leeftijd;
    private String datumInDienst;
    private int salaris;

    public Worker(){
        this("VERANDER NAAM", 0, "VERANDER DATUM", 0);
    }

    public Worker(final String naam) {
        this(naam, 0, "VERANDER DATUM", 0);
    }

    public Worker(final String naam, final int leeftijd) {
        this(naam, leeftijd, "VERANDER DATUM", 0);
    }

    public Worker(final String naam, final int leeftijd, final String datumInDienst) {
        this(naam, leeftijd, datumInDienst, 0);
    }

    public Worker(final String naam, final int leeftijd, final String datumInDienst, final int salaris) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.datumInDienst = datumInDienst;
        this.salaris = salaris;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(final String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(final int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getDatumInDienst() {
        return datumInDienst;
    }

    public void setDatumInDienst(final String datumInDienst) {
        this.datumInDienst = datumInDienst;
    }

    public int getSalaris() {
        return salaris;
    }

    public void setSalaris(final int salaris) {
        this.salaris = salaris;
    }
}
