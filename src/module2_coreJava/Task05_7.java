package module2_coreJava;

import java.util.Scanner;

public class Task05_7 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int numberOfDigitsOfA = String.valueOf(a).length();
		
		int sum = a+b;
		
		int numberOfDigitsOfSum = String.valueOf(sum).length();
		
		if(numberOfDigitsOfA == numberOfDigitsOfSum) {
			System.out.println("Result :"+ sum);
		}
		else {
			System.out.println("Result :"+ a);
		}

	}

}
