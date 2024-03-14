package module2_coreJava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task07_2 {
    private static final Logger logger = Logger.getLogger(Task07_2.class.getName());

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Speed");
		int speed = scanner.nextInt();

		System.out.println("Birthday or not");
		boolean birthday = scanner.nextBoolean();

		int result = calculateTicket(speed, birthday);
        logger.info("Ticket : " + result);
        scanner.close();
    }

    public static int calculateTicket(int speed, boolean birthday) {
        if (birthday) {
            speed -= 5;
            logger.info("Birthday- Person can be travel with 5 speed more " + speed);
        }

        int result;
        if (speed <= 60) {
            result = 0;
            logger.info("speed limit not exceeded - no ticket issued");
        } else if (speed >= 61 && speed <= 80) {
            result = 1;
            logger.warning("speed between 61 and 80 - Small ticket issued");
        } else {
            result = 2;
            logger.severe("speed exceeds 80 - Big ticket issued");
        }

        return result;
    }
}