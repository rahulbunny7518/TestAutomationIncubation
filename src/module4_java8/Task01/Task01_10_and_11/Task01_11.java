package module4_java8.Task01.Task01_10_and_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task01_11 {
	public static void main(String[] args) {
		List<Employee1> employees = new ArrayList<>();
		employees.add(new Employee1("Vijay", 1));
		employees.add(new Employee1("Akhil", 2));
		employees.add(new Employee1("Abhi", 3));
		employees.add(new Employee1("Dev", 4));
		
		System.out.println("Without Lambda");
		
		Collections.sort(employees);
		
		for(Employee1 emp1 : employees) {
			System.out.println(emp1);
		}
		
		System.out.println();
		
		System.out.println("With Lambda");
		
		
		List<Employee2> employees2 = new ArrayList<>();
		employees2.add(new Employee2("Vijay", 1));
		employees2.add(new Employee2("Akhil", 2));
		employees2.add(new Employee2("Abhi", 3));
		employees2.add(new Employee2("Dev", 4));
		
		Collections.sort(employees2, (e1, e2) -> e2.getName().compareTo(e1.getName()));
		
		for(Employee2 emp2 : employees2) {
			System.out.println(emp2);
		}	
	}
}
