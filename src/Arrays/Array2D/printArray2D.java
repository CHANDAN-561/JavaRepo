package Arrays.Array2D;

import java.util.Scanner;

public class printArray2D {

    public static void getMaxElement (int[][] numbers, int rows, int columns) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] > max) max = numbers [i][j];
            }
        }
        System.out.print("Maximum element is: " + max);
    }

    public static void getMinElement (int[][] numbers, int rows, int columns) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                if (numbers[i][j] < min) min = numbers[i][j];
            }
        }
        System.out.print("Minimum element is: " + min);
    }

    public static void inputArray (int[][] numbers, Scanner input, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                numbers [i][j] = input.nextInt();
            }
        }
        printArray(numbers, rows, columns);
    }

    public static void printArray (int[][] numbers, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numbers = new int[rows][columns];
        inputArray(numbers, input, rows, columns);

        System.out.println("Enter 'max' to find the maximum element in the array and 'min' to find the minimum element in the array");
        System.out.print("Enter your choice: ");
        if (input.nextLine().equals("max")) getMaxElement(numbers, rows, columns);
        else if (input.nextLine().equals ("min")) getMinElement(numbers, rows, columns);
        else System.out.print("Invalid choice!");

        input.close();
    }
}
