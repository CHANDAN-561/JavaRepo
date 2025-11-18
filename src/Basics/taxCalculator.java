package Basics;

import java.util.Scanner;

class taxCalculator {
	public static void main(String[] args) {
		int salary;
		int tax;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		salary = input.nextInt();

		if (salary < 500000) {
			System.out.println("Gross salary: " + salary);
			tax = 0;
			System.out.println("Tax (0%): " + tax);
			System.out.println("Salary after tax: " + (salary - tax));
		} else if (salary >= 500000 && salary < 1000000) {
			System.out.println("Gross salary: " + salary);
			tax = (20 * salary) / 100;
			System.out.println("Tax (20%): " + tax);
			System.out.println("Salary after tax: " + (salary - tax));
		} else {
			System.out.println("Gross salary: " + salary);
			tax = (30 * salary) / 100;
			System.out.println("Tax (30%): " + tax);
			System.out.println("Salary after tax: " + (salary - tax));
		}
		input.close();
	}
}