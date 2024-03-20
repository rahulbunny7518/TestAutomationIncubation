package module4_java8.Task01;

import java.util.TreeSet;

public class Task01_7 {
	public static void main(String[] args) {
		System.out.println("With Lambda ");
		TreeSet<Integer> treeset = new TreeSet<>( (a,b) -> b-a);
		treeset.add(15);
		treeset.add(20);
		treeset.add(18);
		treeset.add(25);
		treeset.add(16);
		
		System.out.println(treeset);
		//treeset.stream().sorted((t1,t2)-> t2-t1).forEach(t -> System.out.println(t));
		
		System.out.println();
		System.out.println("Without Lambda");
		
		TreeSet<Integer> treeset2 = new TreeSet<>();
		treeset2.add(25);
		treeset2.add(30);
		treeset2.add(28);
		treeset2.add(35);
	
		treeset2.stream().sorted((t1,t2)-> t2-t1).forEach(System.out::println);		
	}
}
