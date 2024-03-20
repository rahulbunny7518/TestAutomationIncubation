package module4_java8.Task08;

public class Product {
	String name, category;
	double price;
	int grade;
	
	public Product(String name, double price, String category, int grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "[name ="+this.name+" , price ="+this.price+" , category = "+this.category+" , grade ="+this.grade+"]";
	}
}
