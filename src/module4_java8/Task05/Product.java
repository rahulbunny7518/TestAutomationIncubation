package module4_java8.Task05;

public class Product {
	private String name, category;
	private double price;
	private int grade;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.category = "Category1";
		this.grade = 9;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "[name ="+this.name+", price ="+this.price+", category="+this.category+", grade ="+this.grade+"]";
	}
}
