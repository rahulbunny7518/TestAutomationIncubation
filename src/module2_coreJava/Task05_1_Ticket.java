package module2_coreJava;

import java.util.Scanner;

public class Task05_1_Ticket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Speed");
		int speed = scanner.nextInt();
		
		System.out.println("Birthday or not");
		boolean birthday= scanner.nextBoolean();
		
		if (birthday) {
            speed -= 5;
        }

        // Check the speed and return the corresponding ticket result
        if (speed <= 60) {
            System.out.println(0 + " no ticket");
        } else if (speed >= 61 && speed <= 80) {
            System.out.println(1 + " small ticket");;
        } else {
            System.out.println(2+ "  big ticket");
        }
        
        scanner.close();
	}
}
