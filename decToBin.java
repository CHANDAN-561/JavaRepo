	import java. util.Scanner;
	class decToBin {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int [] arr = new int [8];
			System.out.print("Enter a decimal number: ");
			int n = input.nextInt();
			int og_val = n, index = arr.length-1;
			 while ( n>0 && index >= 0){
			 	arr [index] = n%2;
			 	n/=2;
			 	index --;
			 }
			
			System.out.print(og_val+" in binary is: ");
			for (int i : arr){
				System.out.print(i+" ");
			}
			input.close();
		}
	}