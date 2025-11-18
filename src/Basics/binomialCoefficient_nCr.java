
package Basics;

import java.util.Scanner;

public class binomialCoefficient_nCr {
	public static int factorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}

	public static int BinCoeff(int n, int r) {
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int fact_nmr = factorial(n - r);

		return (fact_n / (fact_r * fact_nmr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter r: ");
		int r = sc.nextInt();
		System.out.print("Binomial Coefficient is: " + BinCoeff(n, r));
		sc.close();
	}
}