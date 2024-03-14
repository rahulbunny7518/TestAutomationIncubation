package module2_coreJava;

import java.util.Scanner;

public class Task04_Strings_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First String");
		String str1 = scanner.next();
		System.out.println("Enter Second String");
		String str2 = scanner.next();

		if (str1.length() != str2.length()) {
			System.out.println("Two strings are not rotations of each other");
		} else {
			
			str1 = str1+str1;
			
			if (str1.contains(str2))
				System.out.println("Two strings are rotations of each other");
			else
				System.out.println("Two strings are not rotations of each other");
		}
		
		scanner.close();
	}
}
