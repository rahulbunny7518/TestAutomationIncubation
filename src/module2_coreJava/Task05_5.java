package module2_coreJava;

import java.util.Scanner;

public class Task05_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c and bok values");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		boolean bOk = scanner.nextBoolean();
		
		if (bOk) {
			System.out.println("Result: "+ (c>b));
		}
		else{
			System.out.println("Result: "+(b>a && c>b));
		}
		
		scanner.close();
	}

}
