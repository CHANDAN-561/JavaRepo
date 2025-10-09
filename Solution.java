import java.util.Scanner;
class Solution {

	static Scanner input = new Scanner(System.in);

	static void arrayInput(int[] passedArray) {
		System.out.println("Enter the special digits you want to search for");
		for (int i = 0 ; i < passedArray.length ; i++) {
			System.out.print("Enter " + i + "th value: ");
			passedArray[i] = input.nextInt();
		}
	}

	static int countValid(int n, int [] arr) {
		int rangeStart = (int)Math.pow(10, n - 1);
		int rangeEnd = (int) Math.pow(10, n);
		int rem, digit, originalValue, count = 0;
		label:
		for (int i = rangeStart; i < rangeEnd;  i++) {
			digit = i;
			originalValue = i;
			while (digit > 0) {
				rem = digit % 10;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == rem) {
						count++;
						continue label;
					}
				}
				digit /= 10;
			}
		}
		return count;
	}


	public static void main(String[]args) {
		System.out.print("Enter the number of digit: ");
		int n = input.nextInt();
		System.out.print("Enter the number of special digits you want in the array: ");
		int m = input.nextInt();
		int[] arr = new int [m];
		arrayInput(arr);
		System.out.println(countValid(m,arr));
		input.close();
	}
}