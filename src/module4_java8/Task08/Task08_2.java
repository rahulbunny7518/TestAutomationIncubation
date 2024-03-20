package module4_java8.Task08;

import java.util.ArrayList;
import java.util.List;

import module4_java8.Task02_Task03.Product;

public class Task08_2 {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("apple", 1200,"electronics", 10));
		list.add(new Product("banana", 50,"electronics", 8));
		list.add(new Product("pineapple", 1400,"electronics", 9));
		list.add(new Product("grapes", 1.45,"ab", 6));
		
		list.stream().filter( product -> product.getCategory().equalsIgnoreCase("electronics")).forEach(System.out::println);
		
	}

}
