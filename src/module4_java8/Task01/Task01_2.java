package module4_java8.Task01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(15);
		list.add(25);
		
		List<Integer> sortedNumbers = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println("Without Lambda - 2nd Biggest number: "+ sortedNumbers.get(list.size()-2));
		
		
		System.out.println();
		
		System.out.println("Using Lambda");
		
		int secondLargestNumber = list.stream().sorted((t1,t2)-> t2-t1).distinct().skip(1).findFirst().orElse(-1);
		System.out.println("2nd biggest number :" +secondLargestNumber);
	}

}
