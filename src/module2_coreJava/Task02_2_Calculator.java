package module2_coreJava;

import java.util.Scanner;

public class Task02_2_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter number 2");
		double number2 = scanner.nextDouble();
		
		System.out.println("Enter Operator");
		char operation= scanner.next().charAt(0);
		
		double result = 0;
		
		switch(operation){
			case '+':
				result = number1 + number2;
				break;
			
			case '-':
				result = number1 - number2;
				break;
				
			case '*':
				result = number1 * number2;
				break;
			
			case '/':
				result = number1 /number2;
				break;
				
			case '%':
				result = number1 % number2;
				break;
			
			case 'p':
				result = (number1 / number2)*100;
				break;
				
			default:
				System.out.println("Error: Invalid operation");
		}
		
		System.out.println("Result is :"+ result);
	}
}
