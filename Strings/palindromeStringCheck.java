package Strings;

import java.util.Scanner;

public class palindromeStringCheck {

    public static String getString (Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    public static boolean checkPalindrome (String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt (str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        String str = getString(input);
        if ( !checkPalindrome (str)) {
            System.out.println("Given string " + str + " is not palindrome.");
        } else {
            System.out.println("Given string " + str + " is palindrome.");
        }

        input.close();
    }
}
