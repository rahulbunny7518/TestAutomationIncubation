package module2_coreJava;

import java.util.Scanner;

public class Task02_1_Basics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name");
		String nameOfThePerson = scanner.next();
		
		System.out.println("Hello, "+ nameOfThePerson);
		
		scanner.close();
	}
}
