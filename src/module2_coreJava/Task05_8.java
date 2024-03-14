package module2_coreJava;

import java.util.Scanner;

public class Task05_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base and remove Strings");
		String base = scanner.nextLine();
		String remove = scanner.nextLine();
		
		String result = removeStringInstancesFromBase(base,remove);
		System.out.println("Base String without remove instances :"+ result);
		scanner.close();
	}
	
	private static String removeStringInstancesFromBase(String base, String remove) {
		
		String baseLower = base.toLowerCase();
		String removeLower = remove.toLowerCase();
		
		StringBuilder result = new StringBuilder();
		
		int startIndex = 0;
		
		int indexOfRemove = baseLower.indexOf(removeLower, startIndex);
		
		while(indexOfRemove!=-1) {
			result.append(base.substring(startIndex, indexOfRemove));
			
			startIndex= indexOfRemove + remove.length();
			
			indexOfRemove = baseLower.indexOf(removeLower, startIndex);
		}
		
		return result.toString();
		
	}

}
