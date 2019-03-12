package Chapter5;

public class Exc10 {
    public static void main(String[] args) {
        int number1 = 57;
        int number2 = 33;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println((number1+=number2));
        System.out.println((number1-=number2));
        System.out.println((number1*=number2));
        System.out.println((number1/=number2));
        System.out.println((number1%=number2));
        System.out.println((number1&=number2));
        System.out.println((number1|=number2));
        System.out.println((number1^=number2));
        System.out.println((number1>>=number2));
        System.out.println((number1<<=number2));
        System.out.println((number1>>>=number2));
    }
}
