package module4_java8.Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task01_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(31);
		
		System.out.println("Without Lambda");
		
		Collections.sort(list, new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
				//return o2-o1;
			}
		});
		
		System.out.println(list);
		
		System.out.println();
		
		System.out.println("WIth Lambda");
		List<Integer> list2 = new ArrayList<>();
		list2.add(42);
		list2.add(333);
		list2.add(45);
		list2.add(10);
		
		Collections.sort(list2, (a, b)-> b-a);
		System.out.println(list2);
	}
}
