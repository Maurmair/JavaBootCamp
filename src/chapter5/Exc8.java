package chapter5;

import java.io.File;

public class Exc8 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 7;

//        System.out.println("a << b:\t"+ (a << b));
//        System.out.println("b << c:\t"+ (b << c));
//        System.out.println("a >>> b:\t"+ (a >>> b));
//        System.out.println("c >>> b:\t"+ (c >>> b));
//        System.out.println("a >> c:\t"+ (a >> c));

        // We create an instance of a File to represent a partition
        // of our file system. For instance here we used a drive D:
        // as in Windows operating system.
        File file = new File("C:");

        // Using the getTotalSpace() we can get an information of
        // the actual size of the partition, and we convert it to
        // mega bytes.
        long totalSpaceBytes = file.getTotalSpace();
        long totalSpaceKBytes = totalSpaceBytes>>10;
        long totalSpaceMBytes = totalSpaceKBytes>>10;
        long totalSpaceGBytes = totalSpaceMBytes>>10;


        // Next we get the free disk space as the name of the
        // method shown us, and also get the size in mega bytes.
        long freeSpace = file.getFreeSpace() / (1024 * 1024);

        // Just print out the values.
        System.out.println("Total Space = " + totalSpaceBytes + " Bytes");
        System.out.println("Total Space = " + totalSpaceKBytes + " KBytes");
        System.out.println("Total Space = " + totalSpaceMBytes + " MKBytes");
        System.out.println("Total Space = " + totalSpaceGBytes + " GKBytes");
//        System.out.println("Free Space = " + freeSpace + " Mega Bytes");
        byte aa = 00000001;
//        byte ab = 00010110;
//        System.out.println(aa);reken
//        System.out.println(ab);
    }
}
