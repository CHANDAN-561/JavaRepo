package Sorting;

import java.util.Scanner;
class selectionSort {

    public static void getArray (int numbers[], Scanner input) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print("[" + i + "]: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Before Sorting:");
        printArray(numbers);
    }

    public static void printArray(int numbers[]) {
        for (int index : numbers) {
            System.out.print(" " + index);
        }
        System.out.println();
    }

   public static void sort (int numbers[]) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallest = i;
            for (int j = i; j < numbers.length - 1; j++) {
                if (numbers[smallest] > numbers[j]) {
                    smallest = j;
                }
            }
            temp = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = temp;
        }
        System.out.print("After sorting: ");
        printArray(numbers);
   }

    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the length of your Array: ");
        int n = input.nextInt();
        int numbers[] = new int[n];
        getArray(numbers,input);
        sort(numbers);
    }
}