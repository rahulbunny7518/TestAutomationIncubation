package module4_java8.Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task01_6 {
	public static void main(String[] args) {
				
		ArrayList<Employee> empList =new ArrayList<>();
		empList.add(new Employee("Viru", 80000));
		empList.add(new Employee("Ajay", 40000));
		empList.add(new Employee("Balu", 35000));
		empList.add(new Employee("Ayaan", 40000));
		empList.add(new Employee("Abhi", 30000));
		
		System.out.println("With Lambda");
		
		Collections.sort(empList, new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		
		System.out.println(empList);
		
		System.out.println();
		
		System.out.println("Without Lambda");
		
		ArrayList<Employee> empList2 =new ArrayList<>();
		empList2.add(new Employee("Jawahar", 80000));
		empList2.add(new Employee("Navodaya", 40000));
		empList2.add(new Employee("Bantu", 35000));
		empList2.add(new Employee("Cam", 40000));
		
		Collections.sort(empList2, Comparator.comparing(Employee::getName));
		System.out.println(empList2);
	}
}
