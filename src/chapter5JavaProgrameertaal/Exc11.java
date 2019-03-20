package chapter5JavaProgrameertaal;

public class Exc11 {
    public static void main(String[] args) {
        int n1 = 57;
        int n2 = 33;
        int n3 = -65;
        System.out.println("Print smallest nr");
        System.out.println(n1 + " < " +n2+"\t\t\t"+((n1<n2)?n1:n2));
        System.out.println(n1 + " < " +n3+"\t\t"+((n1<n3)?n1:n3));
        System.out.println(n2 + " < " +n1+"\t\t\t"+((n2<n1)?n2:n1));
        System.out.println(n2 + " < " +n3+"\t\t"+((n2<n3)?n2:n3));
        System.out.println(n3 + " < " +n1+"\t\t"+((n3<n1)?n3:n1));
        System.out.println(n3 + " < " +n2+"\t\t"+((n3<n2)?n3:n2));
    }
}
