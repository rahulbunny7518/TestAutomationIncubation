package module2_coreJava;

import java.util.Scanner;

public class Task05_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers in the range 10..99");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int leftDigitOfNum1 = num1/10;
		int rightDigitOfNum1 = num1%10;
		
		int leftDigitOfNum2 = num2/10;
		int rightDigitOfNum2 = num2%10;
		
		boolean result = digitAppearsInBothNumbers(leftDigitOfNum1, rightDigitOfNum1, leftDigitOfNum2, rightDigitOfNum2);
		
		System.out.println("Result is: "+ result);
		scanner.close();
	}
	
	private static boolean digitAppearsInBothNumbers(int leftDigitOfNum1, int rightDigitOfNum1, int leftDigitOfNum2, int rightDigitOfNum2) {
		return ((leftDigitOfNum1 == leftDigitOfNum2)||(leftDigitOfNum1 == rightDigitOfNum2)||(rightDigitOfNum1 == leftDigitOfNum1)||(rightDigitOfNum1 == rightDigitOfNum2));
	}

}
