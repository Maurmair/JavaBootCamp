package chapter7Arrays;

public class Exc3 {
    public static void main(String[] args) {
        int[][] table = new int[4][6];
        int rijNr = 1;
        int kolomNr = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = rijNr * kolomNr;
                kolomNr++;
            }
            kolomNr=1;
            rijNr++;
        }
        for(int[] row: table){
            for(int el:row){
                System.out.print(el+"\t");
            }
            System.out.println();
        }
    }
}

