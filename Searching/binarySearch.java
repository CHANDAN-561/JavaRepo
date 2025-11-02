package Searching;
import java.util.Scanner;

class binarySearch {

    public static void performBinarySearch (int[] numbers, int key, int start, int end) {
        int mid = (start + end) / 2;

        if (key == numbers[mid]) {
            System.out.print("Key " + key + " found at position: " + mid);
            return;
        } else if (key > numbers[mid]){
            performBinarySearch (numbers, key, mid + 1, end);
        } else {
            performBinarySearch (numbers, key, start, mid - 1);
        }

    }

    public static void performSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print(System.lineSeparator() + "After Sort: ");
        printArray(numbers);
    }

    public static int getArraySize (Scanner input) {
        System.out.print("Enter the array size: ");
        return input.nextInt();
    }

    public static int getKey (Scanner input) {
        System.out.print(System.lineSeparator() + "Enter the key: ");
        return input.nextInt();
    }

    public static void printArray (int[] numbers) {
        for (int index : numbers) {
            System.out.print(index + " ");
        }
    }

    public static void getArrayValues (int[] numbers , Scanner sc) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print ("[" + i + "]: ");
            numbers [i] =  sc.nextInt();
        }
        System.out.print("Before sorting: ");
        printArray(numbers);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        int[] numbers = new int [getArraySize (input)];
        getArrayValues(numbers, input);

        performSort(numbers);
        int key = getKey(input);
        performBinarySearch(numbers,key, 0, numbers.length - 1);
        input.close();
    }
}