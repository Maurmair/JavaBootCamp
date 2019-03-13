package chapter5;

public class Exc9 {
    public static void main(String[] args) {
        int heating = 0x00;
        final int HALL = 0x01;
        final int LIVINGROOM = 0x02;
        final int KITCHEN = 0x04;
        final int VERANDA = 0x08;
        final int BEDROOM = 0x10;
        final int LAUNDRY = 0x20;
        final int BATHROOM =0x40;
        final int CELLAR = 0x80;

        final int DOWNSTAIRS = HALL | KITCHEN | LIVINGROOM | VERANDA;
        final int UPSTAIRS = BEDROOM | BATHROOM ;
        heating |= LIVINGROOM;
        System.out.println("Heating in living room on: heating = heating | LIVIINGROOM\t\t" + (heating));
        heating &= ~LIVINGROOM;
        System.out.println("Heating in living room off: heating = heating & ~LIVINGROOM\t\t" + heating);
        heating |= DOWNSTAIRS;
        System.out.println("Heating downstairs on: heating = heating | DOWNSTAIRS\t\t\t"+heating);
        heating |= UPSTAIRS;
        System.out.println("Heating upstairs on: heating = heating | UPSTAIRS\t\t\t\t"+heating);
        heating ^= DOWNSTAIRS;
        System.out.println("Heating downstairs switched: heating = heating ^ DOWNSTAIRS\t\t"+heating);
        System.out.println("Check heating in bathroom: (heating & BATHROOM)==BATHROOM\t\t" +((heating & BATHROOM)==BATHROOM));
        heating &= ~UPSTAIRS;
        System.out.println("Heating upstairs off: heating = heating & ~UPSTAIRS\t\t\t\t"+heating);
    }
}
