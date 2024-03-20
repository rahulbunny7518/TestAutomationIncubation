package module4_java8.Task04;

import java.util.Random;

public class Supplier {
	private static final Random random = new Random();
	
	public static Product generateRandomProduct() {
		String[] categories = {"electronics","clothing","books"};
		String[] grades = {"standard","premium"};
		
		String name = "Product"+ random.nextInt(1000);
		double price = random.nextDouble() * 4000;
		String category = categories[random.nextInt(categories.length)];
		String grade = grades[random.nextInt(grades.length)];
		
		return new Product(name, price, category, grade);
	}
	
	public static String generateRandomOTP() {
		return String.format("%06d", random.nextInt(100000));
	}
}
