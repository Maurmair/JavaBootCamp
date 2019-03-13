package chapter6;

public class Exc3 {
    public static void main(String[] args) {
        String regelTekst = "Dit IS eeN random Stuk TeKsT";
        System.out.println(regelTekst+"\nAantal tekens: "+regelTekst.length()+"\t");
        System.out.println(regelTekst.toUpperCase());
        System.out.println(regelTekst.toLowerCase());
        System.out.println(regelTekst.replace('a','o'));
        int hoeveelheidE = 0;
        for (int  i = 0 ; i <= regelTekst.length()-1; i++) {
            if (regelTekst.charAt(i) == 'e') {
                hoeveelheidE++;
            }
        }
        System.out.println(hoeveelheidE);
        String een = "een";
        String twee = "twee";
        System.out.println(een.equals(twee));
        System.out.println((een.charAt(0)>twee.charAt(0))?twee+", "+een:een+", "+twee);

        String spaties = "     met spaties      ";
        System.out.println(spaties);
        System.out.println("Zonder spaties");
        System.out.println(spaties.replaceAll("\\s",""));
    }
}
