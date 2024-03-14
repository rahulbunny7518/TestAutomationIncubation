package module1_OopsConcepts;

import java.util.Scanner;

public class Task2 {
	
	static int costOfGivenFlowers(int numberOfFlowers, int costOfEachFlower) {
		
		return numberOfFlowers * costOfEachFlower ;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number of Roses a Customer want in a Bouquet");
		int numberOfRoses = scanner.nextInt();
		
		System.out.println("enter number of Jasmines a Customer want in a Boquet");
		int numberOfJasmines = scanner.nextInt();
		
		System.out.println("enter number of Lilys a Customer want in a Boquet");
		int numberOfLilys = scanner.nextInt();
		
		int costOfRoses = costOfGivenFlowers(numberOfRoses, 1);
		int costOfJasmines = costOfGivenFlowers(numberOfJasmines, 2);
		int costOfLilys = costOfGivenFlowers(numberOfLilys, 3);
		
		System.out.println("Cost of a Boquet : "+ (costOfRoses+costOfJasmines+costOfLilys) +"$");
		
		scanner.close();
	}

}
