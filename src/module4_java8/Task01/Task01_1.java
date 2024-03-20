package module4_java8.Task01;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task01_1 {

	public static void main(String[] args) {
		
		Predicate <String> palindrome = (str) ->{
			String rev = new StringBuilder(str).reverse().toString();
			return str.equals(rev);
		};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a String");
		String str = scanner.next();
		
		boolean result = checkPalindromeWithoutLambda(str);
		System.out.println("Without Lambda :"+ result);
		
		System.out.println();
		
		System.out.println("With Lambda :"+ palindrome.test(str));
		scanner.close();
	}
	
	private static boolean checkPalindromeWithoutLambda(String str) {
		boolean flag=false;
		StringBuffer sb = new StringBuffer(str).reverse();
		if(str.equalsIgnoreCase(sb.toString())) {
			flag=true;
		}
		
		return flag;
	}
}
