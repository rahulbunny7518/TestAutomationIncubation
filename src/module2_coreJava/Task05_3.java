package module2_coreJava;

import java.util.Scanner;

public class Task05_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Tea and Candy Amounts");
		int tea = scanner.nextInt();
		int candy = scanner.nextInt();
		
		int result = partyResult(tea, candy);
		System.out.println("Result is: "+ result);
	}
	
	private static int partyResult(int tea,int candy) {
		
		if (tea < 5 || candy < 5) {
            return 0;
        }
        
		else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; 
        }

		else if (tea >= 5 && candy >= 5) {
            return 1; 
        }
		else {
			return -1;
		}
	}
}
