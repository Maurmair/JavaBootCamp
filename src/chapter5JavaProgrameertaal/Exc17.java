package chapter5JavaProgrameertaal;

public class Exc17 {
    public static void main(String[] args) {
//        een();
//        twee();
//        drie();
//        vier();
//        vijfEnZes();
//        zeven();
        acht();
    }

    private static void een(){
        for(int i=400; i>=350; i--){
            System.out.println(i);
        }
    }
    private static void twee(){
        for (int a=0, b=0; b<200;a++){
            b = a * 7;
            if (b >= 200) {
                a++;
            } else {
                System.out.println(b);
            }
        }
    }
    private static void drie(){
        for (int a=0, b=0; b<=100000; a++){
            b = (int)Math.pow(a,11);
            if (b>=100000){
                break;
            }
            System.out.println(b);
            a++;
        }
    }
    private static void vier(){
        for (int i = 90; i >= 65; i--) {
            System.out.println((char)i);
        }
    }
    private static void vijfEnZes() {
        for (int i = -10; i <= 10; i++){
            System.out.println((i>0)?"+"+i:i);
        }
    }
    private static void zeven() {
        for (int i = 0; i <= 10000; i++){
            System.out.print((i%6 ==0 && i%28==0)?i+"\n":"");
        }
    }
    //TODO AFMAKEN
    private static void acht() {
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
