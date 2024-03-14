package module2_coreJava;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task07_4 {
    private static final Logger logger = Logger.getLogger(Task07_4.class.getName());

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	configureLogToFile();

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
    
    private static void configureLogToFile() {
        try {
            FileHandler fileHandler = new FileHandler("log_custom.txt");

      
            fileHandler.setFormatter(new CustomFormatter());

            logger.addHandler(fileHandler);

            logger.setLevel(Level.ALL);

            fileHandler.setLevel(Level.ALL);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error while configuration", e);
        }
    }
    
    static class CustomFormatter extends Formatter {
        @Override
        public String format(java.util.logging.LogRecord record) {
            StringBuilder builder = new StringBuilder();
            builder.append(new Date(record.getMillis())).append(" ");
            builder.append(record.getLevel()).append(": ");
            builder.append(formatMessage(record)).append("\n");
            return builder.toString();
        }
    }
}
