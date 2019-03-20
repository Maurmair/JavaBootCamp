package chapter11Enums;

public enum Planet {
    MERCURIUS(57910000,0.1f,4880),
    VENUS(108208930,0.9f, 12104),
    AARDE(149597870, 1.0f, 12756),
    MARS(227936640,0.1f,6794),
    JUPITER(778412010,318f,142984),
    SATURNUS(1426725399,95f,120536),
    URANUS(287097220, 15f,51118),
    NEPTUNUS(449825290,17f, 49572);

    private int afstandTotZon;
    private float massaTOVAarde;
    private int diameter;

    private Planet(int afstandTotZon, float massaTOVAarde, int diameter){
        this.afstandTotZon = afstandTotZon;
        this.massaTOVAarde = massaTOVAarde;
        this.diameter = diameter;
    }

    public String toString(){
        return "Planeet: " + name() +
                "\n\tAfstand tot zon(km):\t" + afstandTotZon +
                "\n\tMassa t.o.v. aarde: \t" + massaTOVAarde +
                "\n\tDiameter: \t" + diameter +
                "\n\tordinal: \t" + ordinal();
    }

}
