package module4_java8.Task06;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class Task06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntConsumer squareOfNum = num -> System.out.println("Square of number is :"+ num * num);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		squareOfNum.accept(number);
		
		scanner.close();

	}

}
