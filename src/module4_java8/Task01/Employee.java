package module4_java8.Task01;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return "[name ="+ this.name + ", salary="+this.salary+"]";
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}
}