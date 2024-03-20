package module4_java8.Task01;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Task01_3 {

	public static void main(String[] args) {
		
		BiPredicate<String, String> rotations =(str1, str2) ->{
			
			if(str1.length() != str2.length()) {
				return false;
			}
			else {
				String temp2 = str1.concat(str1);
				return temp2.contains(str2);
			}
		};	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		
		System.out.println("Without Lambda");	
		if (str1.length() != str2.length()) {
			System.out.println("Not rotations of each other");
		} else {
			String temp1 = str1 + str1;

			if (temp1.indexOf(str2) != -1) {

				System.out.println("rotations of each other");
			} else {
				System.out.println("Not rotations of each other");
			}
		}
		
		
		System.out.println();
		System.out.println("With Lambda");
		
		System.out.println("Rotations of each other ?: "+rotations.test(str1, str2));
		
		scanner.close();
	}
}
