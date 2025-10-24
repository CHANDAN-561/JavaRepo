package Searching;
import java.util.Scanner;

class linearSearch {

    public static void performSearch (int[] values, int key) {
        boolean isFound = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                isFound = true;
                System.out.println ("Key " + key + " found at " + (i+1) +"th position.");
            }
        }
        if (!isFound) {
            System.out.println("Key doesn't exist.");
        }
    }

    public static void printArray (int[] values) {
        for (int index : values) {
            System.out.print(index + " ");
        }
    }

    public static void getArrayValues (int[] values, Scanner input) {
        System.out.println ("Enter the elements");
        for (int i = 0; i < values.length; i++) {
            System.out.print ("[" + i + "]: ");
            values[i] = input.nextInt();
        }
        printArray(values);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] values = new int [size];
        getArrayValues(values, input);
        System.out.print(System.lineSeparator() + "Enter the key: ");
        int key = input.nextInt();
        performSearch(values, key);
    }
}
