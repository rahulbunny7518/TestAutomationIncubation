package module4_java8.Task06;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Task06_1 {

	public static void main(String[] args) {
		
		IntPredicate isPrime = num ->{
			if (num <= 1) return false;
			
			int flag =0;
			for(int i=2; i<= num/2; i++) {
				if(num%i == 0) {
					flag=1;
				}
			}
			
			if(flag == 0) return true;
			else return false;
			
		};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int primeNumbercheckNo = scanner.nextInt();
		
		
		System.out.println(primeNumbercheckNo+" is a Prime Number ? "+ isPrime.test(primeNumbercheckNo));
		
		scanner.close();
	}

}
