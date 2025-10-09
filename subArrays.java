import java.util.Scanner;
public class subArrays {
		public static int printSubArrays(int array[]) {
			int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i ; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print (array [k] + " ");
				}
				total++;
				System.out.println();
			}
			System.out.println();
		}
		return total;
	}
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[ i ] + " ");
		}
		System.out.println();
	}

	public static void getArray(int array[] , Scanner input) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("index [" + i + "]: ");
			array [ i ] = input.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int size = input.nextInt();
		int number [] = new int [size];

		getArray(number , input);
		printArray(number);
		System.out.println("Sub arrays are: ");
		System.out.println("Total Sub Arrays: " + printSubArrays(number));
		input.close();
	}
}