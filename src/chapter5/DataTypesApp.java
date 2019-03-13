package chapter5;

public class DataTypesApp {

    public static void main(String[] args){
        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShortInt = 1568;
        int anInt = 1256456;
        long aLongInt = 45631341L;
        float aDecNumber = 1256.32F;
        double aBigDecimalNumb = 12.365987451236;
        final double PI = 3.14;
//        PI = 3.15;
        aByte = (byte) aShortInt;

        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShortInt);
        System.out.println(anInt);
        System.out.println(aLongInt);
        System.out.println(aDecNumber);
        System.out.println(aBigDecimalNumb);
    }
}
