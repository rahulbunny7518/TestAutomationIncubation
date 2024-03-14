package module2_coreJava;

import java.util.Scanner;

public class Task05_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.next();
		
		int count =1;
		int i =0;
		int maxCount = 0;
		
		for(i=0; i<str.length()-1; i++) {
			if (str.charAt(i)== str.charAt(i+1)) {
				count++;
			}
			else {
				if(count>maxCount) maxCount = count;
				count=1;
			}
		}
		if (count > maxCount) maxCount = count;
		
		System.out.println(maxCount);
		
		scanner.close();

	}

}
