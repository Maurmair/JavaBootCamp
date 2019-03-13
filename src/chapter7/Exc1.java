package chapter7;

import java.util.Arrays;

public class Exc1 {
    public static void main(String[] args) {
//        int[] getallen = new int[20];
//        for (int i = 0; i<= 19; i++){
//            getallen[i] = (i+1)*7;
//        }
//        for(int n:getallen){
//            System.out.print(n+" ");
//        }
//        System.out.println("\n");
//        for (int i = 19; i>=0; i--){
//            System.out.print(getallen[i] + " ");
//        }
//        System.out.println("\n");
//        private static void vier(){
//            boolean[] waarOfNietWaar = {true, false, true, false, true,false};
//            for(boolean b: waarOfNietWaar){
//                System.out.print(b + " ");
//            }
//        }

//        int[] priemgetallenOnderDuizend= new int[5000];
//        for (int i = 0, a = 0; i <= 10000; i++) {
//            if (chapter5.Exc17.isPrime(i)) {
////                System.out.println(i);
//                priemgetallenOnderDuizend[a] = i;
//                a++;
//            }
//        }
//        for (int i: priemgetallenOnderDuizend) {
//            System.out.println(priemgetallenOnderDuizend[i]);
//        }

        int[] sortedArray = {1,5,3,67,8,3,6,8,2,5};
        Arrays.sort(sortedArray);
        for (final int i : sortedArray) {
            System.out.print(i+ " ");
        }
    }
}
