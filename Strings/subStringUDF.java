package Strings;

import java.util.Scanner;

public class subStringUDF {

    public static String getSubString (String str, int start, int end) {
        String subString = "";
        for (int i = start; i <= end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter the sub string starting position: ");
        int start = input.nextInt();
        System.out.print("Enter the sub string ending position: ");
        int end = input.nextInt();
        System.out.println("Substring from " + (start) + " and " + (end) + " is: " + getSubString(str, start - 1, end - 1));

        input.close();
    }
}
