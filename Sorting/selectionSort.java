package Sorting;

import java.util.Scanner;
class selectionSort {

    public static void getArray (int numbers[], Scanner input) {
        System.out.println("Enter your elements");
        for (int i=0; i<numbers.length; i++) {
            System.out.print("[" + i + "]: ");
            numbers[i] = input.nextInt();
        }
        System.out.print("Before Sorting:");
        printArray(numbers);
    }

    public static void printArray(int numbers[]) {
        for (int index : numbers) {
            System.out.print(" " + index);
        }
        System.out.println();
    }

   public static void ascendingSort (int numbers[]) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[smallestIndex] > numbers[j]) {
                    smallestIndex = j;
                }
            }
            temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.print("Ascending Sort: ");
        printArray(numbers);
   }

    public static void descendingSort (int numbers[]) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[largestIndex] < numbers[j]) {
                    largestIndex = j;
                }
            }
            temp = numbers[largestIndex];
            numbers[largestIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.print("Descending Sort: ");
        printArray(numbers);
    }

    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the length of your Array: ");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println("Specify Order: ");
        System.out.print("'1': Ascending Order." + System.lineSeparator() + "'2': Descending Order." + System.lineSeparator() + "'3': both." + System.lineSeparator() + "Enter here: ");
        int userInput = input.nextInt();
        if (userInput == 1) {
            getArray(numbers,input);
            ascendingSort(numbers);
        } else if (userInput == 2) {
            getArray(numbers,input);
            descendingSort(numbers);
        } else if (userInput == 3) {
            getArray(numbers,input);
            ascendingSort(numbers);
            descendingSort(numbers);
        } else {
            System.out.println("Invalid Input.");
        }
        input.close();
    }
}