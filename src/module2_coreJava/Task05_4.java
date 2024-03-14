package module2_coreJava;

import java.util.Scanner;

public class Task05_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int result = lotteryTicket(a, b, c);
		System.out.println("Result: " + result);
		
		scanner.close();
	}

	public static int lotteryTicket(int a, int b, int c) {
		int sumOfab = a + b;
		int sumOfbc = b + c;
		int sumOfac = a + c;

		if (sumOfab == 10 || sumOfbc == 10 || sumOfac == 10) {
			return 10;
		}

		if (sumOfab == 10+ sumOfbc || sumOfab == 10+ sumOfac) {
			return 5;
		}

		return 0;
	}
}
