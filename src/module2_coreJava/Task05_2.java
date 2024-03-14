package module2_coreJava;

import java.util.Scanner;

public class Task05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("Result :"+greatNumber(num1, num2));
	
		scanner.close();
	}

	static boolean greatNumber(int num1, int num2) {
		if (num1 == 6 || num2 == 6 || num1 + num2 == 6 || Math.abs(num1 - num2) == 6) {
			return true;
		} else {
			return false;
		}
	}
}
