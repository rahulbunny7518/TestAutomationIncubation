package module2_coreJava;

import java.util.Scanner;

public class Task03_Loops {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of rows: ");
		int numberOfRows = scanner.nextInt();
		
		System.out.println("Enter increment: ");
		int increment = scanner.nextInt();
		
		pyramidGenerartionWithForLoop(numberOfRows, increment);
		System.out.println();
		pyramidGenerationWithWhileLoop(numberOfRows, increment);
		System.out.println();
		pyramidGenerationWithDoWhileLoop(numberOfRows, increment);
		
		scanner.close();
	}
	
	private static void pyramidGenerartionWithForLoop(int numberOfRows, int increment) {
		
		int currentNumber = 0;
		
		for(int currentRow=1;currentRow<=numberOfRows; currentRow++) {
			for(int count=0; count<currentRow; count++) {
				System.out.print(currentNumber+ "\t");
				currentNumber = currentNumber + increment;
			}
			System.out.println();
		}
	}
	
	private static void pyramidGenerationWithWhileLoop(int numberOfRows, int increment) {
		
		int currentNumber = 0;
		int currentRow=1;
		
		while(currentRow <= numberOfRows) {
			int count = 0;
			while (count < currentRow) {
				System.out.print(currentNumber+"\t");
				currentNumber = currentNumber + increment;
				count++;
			}
			currentRow++;
			System.out.println();
		}
	}
	
	private static void pyramidGenerationWithDoWhileLoop(int numberOfRows, int increment) {
		int currentNumber = 0;
        int currentRow = 1;

        do {
            int numbersInRow = currentRow;
            int count = 0;

            do {
                System.out.print(currentNumber + "\t");
                currentNumber += increment;
                count++;
            } while (count < numbersInRow);

            System.out.println();
            currentRow++;
        } while (currentRow <= numberOfRows);
	}
}