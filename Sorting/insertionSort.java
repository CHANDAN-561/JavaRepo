package Sorting;

import java.util.Scanner;

class insertionSort {

    public static void getArray(int numbers[], Scanner input) {
        System.out.println("Enter your elements");
        for (int i = 0; i < numbers.length; i++) {
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

    public static void ascendingSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > currentValue) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex--;
            }
            numbers[previousIndex + 1] = currentValue;
        }
        System.out.print("Ascending Sort:");
        printArray(numbers);
    }

    public static void descendingSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && numbers[previousIndex] < currentValue) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex--;
            }
            numbers[previousIndex + 1] = currentValue;
        }
        System.out.print("Descending Sort:");
        printArray(numbers);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of your Array: ");
        int n = input.nextInt();
        int numbers[] = new int[n];

        System.out.println("Specify Order: ");
        System.out.print("'1': Ascending Order." + System.lineSeparator() +
                "'2': Descending Order." + System.lineSeparator() +
                "'3': Both." + System.lineSeparator() +
                "Enter here: ");
        int userInput = input.nextInt();

        if (userInput == 1) {
            getArray(numbers, input);
            ascendingSort(numbers);
        } else if (userInput == 2) {
            getArray(numbers, input);
            descendingSort(numbers);
        } else if (userInput == 3) {
            getArray(numbers, input);
            ascendingSort(numbers);
            descendingSort(numbers);
        } else {
            System.out.println("Invalid Input.");
        }
        input.close();
    }
}
