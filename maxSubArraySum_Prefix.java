import java.util.Scanner;
class MaxsubArraySum_Prefix {
	public static void printSubArraySum(int numbers[]) {
		int sum, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int prefixSum [] = new int [numbers.length];
		prefixSum [0] = numbers [0];

		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum [i] = prefixSum [i - 1] + numbers [i];
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i ; j < numbers.length; j++) {
				sum = i == 0 ? prefixSum [j] : prefixSum [j ] - prefixSum [i - 1];
				if (max < sum) max = sum;
				if (min > sum) min = sum;
			}
		}
		System.out.println ("Max sum: " + max);
		System.out.println ("Min sum: " + min);
	}

	public static void printArray(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[ i ] + " ");
		}
		System.out.println();
	}

	public static void getArray(int numbers[], Scanner input) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("index [" + i + "]: ");
			numbers [ i ] = input.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int size = input.nextInt();
		int number [] = new int [size];
		getArray(number, input);
		printArray(number);
		printSubArraySum(number);
		input.close();
	}
}