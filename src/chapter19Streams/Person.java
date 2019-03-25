package chapter19Streams;

public class Person {
    private String voornaam;
    private String achternaam;
    private Geslacht geslacht;
    private int leeftijd;
    private float gewicht;
    private float lengte;

    public Person(final String voornaam, final String achternaam, final Geslacht geslacht, final int leeftijd, final float gewicht,
                  final float lengte) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geslacht = geslacht;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(final String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(final String achternaam) {
        this.achternaam = achternaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(final int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(final float gewicht) {
        this.gewicht = gewicht;
    }

    public float getLengte() {
        return lengte;
    }

    public void setLengte(final float lengte) {
        this.lengte = lengte;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(final Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    @Override
    public String toString() {
        return "Person{" + "voornaam='" + voornaam + '\'' + ", achternaam='" + achternaam + '\'' + ", geslacht=" + geslacht + ", leeftijd="
                + leeftijd + ", gewicht=" + gewicht + ", lengte=" + lengte + '}';
    }
}
