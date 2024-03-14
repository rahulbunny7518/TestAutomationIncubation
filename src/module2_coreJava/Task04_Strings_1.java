package module2_coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04_Strings_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String value");
		String str = scanner.next(); 
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		map.entrySet().stream().filter( t -> t.getValue() > 1).forEach( t -> System.out.println(t.getKey()));
		scanner.close();
	}
}
