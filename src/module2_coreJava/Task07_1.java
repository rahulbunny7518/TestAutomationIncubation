package module2_coreJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task07_1 {
	private static final Logger logger = Logger.getLogger(Task07_1.class.getName());

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Speed");
		int speed = scanner.nextInt();

		System.out.println("Birthday or not");
		boolean birthday = scanner.nextBoolean();

		int result = calculateTicket(speed, birthday);
		logger.info("Result: " + result);
		scanner.close();
	}

	public static int calculateTicket(int speed, boolean birthday) {
		if (birthday) {
			speed -= 5;
		}

		if (speed <= 60) {
			return 0;
		} else if (speed >= 61 && speed <= 80) {
			return 1;
		} else {
			return 2;
		}
	}
}
