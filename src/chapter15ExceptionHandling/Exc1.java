package chapter15ExceptionHandling;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.printf("%d/%d=%d", num, den, div);
            return;
        } catch (NumberFormatException| ArithmeticException t){
            System.out.println("Invalid input");
            System.out.println(t.getMessage());
        } finally {
            keyboard.close();
            System.out.println("\nThe End!");
        }
//        } catch (RuntimeException re) {
//            System.out.println("Wrong input");
//        }
//        } catch (NumberFormatException nfe) {
//            System.out.println("Invalid number");
//            System.out.println(nfe.getMessage());
//            nfe.printStackTrace();
//        } catch (ArithmeticException ae){
//            System.out.println("Division by 0");
//        }


    }
}
