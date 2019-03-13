package chapter6;

public class Exc4 {
    public static void main(String[] args) {
        StringBuilder een = new StringBuilder("This is my first line of text");
        StringBuilder twee = new StringBuilder("This is my second line of text");
        System.out.println(een);
        System.out.println(twee);
        System.out.println(een.append(" and this is what i added"));
        System.out.println(twee.reverse());
        System.out.println(een.toString().replaceAll("\\s",""));
        StringBuilder drie = new StringBuilder("");
        for (int i = 0; i <= twee.length()-1; i++){
            if (twee.charAt(i) == 't'){
                drie.append("tt");
            } else {
                drie.append(twee.charAt(i));
            }
        }
        System.out.println(drie);
    }
}
