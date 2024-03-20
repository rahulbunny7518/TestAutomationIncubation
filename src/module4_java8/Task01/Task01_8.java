package module4_java8.Task01;

import java.util.Set;
import java.util.TreeSet;

public class Task01_8 {
	public static void main(String[] args) {
		System.out.println("Without Lambda");
		
		Set<Employee> treeset = new TreeSet<Employee>();
		treeset.add(new Employee("Rahul", 800000));
		treeset.add(new Employee("Arav", 40000));
		treeset.add(new Employee("Kamlesh", 50000));
		treeset.add(new Employee("Uday", 60000));
		
		
		for( Employee employee: treeset) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("With Lambda");
		
		Set<Employee> treeset2 = new TreeSet<Employee>((e1, e2)-> e1.getName().compareTo(e2.getName()));
		treeset2.add(new Employee("Viraj", 800000));
		treeset2.add(new Employee("Anand", 40000));
		treeset2.add(new Employee("Arav", 50000));
		treeset2.add(new Employee("Balu", 60000));
		
		for( Employee emp: treeset2) {
			System.out.println(emp);
		}
	}
}
