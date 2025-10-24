package Searching;
import java.util.Scanner;

class binarySearch {

    public static int getKey (Scanner sc) {
        System.out.print("Enter the key: ");
        return sc.nextInt();
    }

    public static void printArray (int[] numbers) {
        for (int index : numbers) {
            System.out.print(numbers[index] + " ");
        }
    }

    public static void arrayInput (int[] numbers , Scanner sc) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print ("[" + i + "]: ");
            numbers [i] =  sc.nextInt();
        }
        printArray(numbers);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the size of the Array: ");
        int size = input.nextInt();
        int[] numbers = new int [size];
        arrayInput(numbers, input);
        int key = getKey(input);
    }
}