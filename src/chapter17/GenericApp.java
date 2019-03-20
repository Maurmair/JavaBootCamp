package chapter17;

public class GenericApp {
    public static void main(String[] args) {
//        first();
//        second();
//        third();
//        fourth();
//        fifh();
        sixth();
    }

    private static void sixth() {
        Duo<Integer> id = new Duo<>(2,4);
        Duo<Long> ld = new Duo<>(47389189237894789L,789217893291L);
        Duo<Float> fd = new Duo<>(5.7f,8.9f);
        Duo<Number> nd = new Duo<>(4.8,56D);
        Duo<String> sd = new Duo<>("Hoi","Doei");
        DuoUtility.printSum(id);
        DuoUtility.printSum(ld);
        DuoUtility.printSum(fd);
        DuoUtility.printSum(nd);
        DuoUtility.printUpper(sd);
        DuoUtility.printDuo(nd);
        DuoUtility.printDuo(sd);
    }

    private static void fifh() {
        ComparableDuo<Integer> comparableDuo = new ComparableDuo<>(4,6);
        System.out.println(comparableDuo.getHighest());
        System.out.println(comparableDuo.getLowest());
    }

    private static void fourth() {
        Shoe right = new Shoe("RR");
        Shoe left = new Shoe("LL");
        ShoePair shoePair = new ShoePair(new Shoe("Left"),new Shoe("Right"));
        GeneralPair<Shoe> pair = new GeneralPair<>(right,left);
        System.out.println(pair);
    }

    private static void first(){
        Duo<String> duo = new Duo("Hoi","Doei");
        Duo<Integer> duoo = new Duo(1,2);
        String s1 = duo.getFirst();
        String s2 = duo.getSecond();
        Integer i1 = duoo.getFirst();
        Integer i2 = duoo.getSecond();
        System.out.println(s1+s2);
        System.out.println(i1+i2);

        duo.swap();
        duoo.swap();
        s1 = duo.getFirst();
        s2 = duo.getSecond();
        i1 = duoo.getFirst();
        i2 = duoo.getSecond();
        System.out.println(s1+s2);
        System.out.println(i1+i2);
    }

    private static void second(){
        MixedDuo<String, Integer> mixedDuo = new MixedDuo<>("HelloWorld", 2019);
        String s1 = mixedDuo.getFirst();
        Integer i1 = mixedDuo.getSecond();

        System.out.println(s1+i1);
    }

    private static void third(){
        NumberDuo<Integer> nd1 = new NumberDuo<>(3,5);
        NumberDuo<Double> nd2 = new NumberDuo<>(3.2,5.8);
        NumberDuo<Number> nd3 = new NumberDuo<>(3.2,5);
        System.out.println(nd1.getSum());
        System.out.println(nd2.getSum());
        System.out.println(nd3.getSum());
    }
}
