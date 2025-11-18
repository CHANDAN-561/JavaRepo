package Arrays;
import java.util.Scanner;

public class rotateArrayByKPosition {

    public static void rotate(int[] numbers, int position) {

    }

    public static void printArray (int[] numbers) {
        for (int index : numbers) {
            System.out.print(index + " ");
        }
    }

    public static void getArray (int[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]: ");
            numbers[i] = input.nextInt();
        }
        printArray(numbers);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        getArray(numbers, input);

        System.out.print("Enter the position: ");
        int position = input.nextInt();
        
        rotate (numbers, position);

        input.close();
    }
}
