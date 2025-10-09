import java.util.Scanner;
public class pairsInArray {

	public static int pairs(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.print("(" + array[ i ] + "," + array[ j ] + ")");
				count++;
			}
			System.out.println();
		}
		return count;
	}

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[ i ] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int size = input.nextInt();
		int number [] = new int [size];

		for (int i = 0; i < number.length; i++) {
			System.out.print("index [" + i + "]: ");
			number [ i ] = input.nextInt();
		}
		printArray(number);
		System.out.println("Pairs are: ");
		System.out.println ("Total pairs: " + pairs(number));
		input.close();
	}
}