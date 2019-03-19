package chapter5;

import java.util.Scanner;

public class KeyBoardUtilityImpl implements KeyBoardUtility {

    @Override
    public int readInt() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
