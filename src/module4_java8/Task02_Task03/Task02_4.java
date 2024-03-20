package module4_java8.Task02_Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task02_4 {
	public static void main(String[] args) {
		
		Predicate<Product> predicate = product-> {
			return product.getPrice()>100 || product.getCategory().equalsIgnoreCase("electronics");
		};
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("apple", 1200,"electronics", 10));
		list.add(new Product("banana", 50,"electronics", 8));
		list.add(new Product("pineapple", 1400,"electronics", 9));
		list.add(new Product("grapes", 1.45,"ab", 6));
		
		
		for(Product product : list) {
			if(predicate.test(product)) {
				System.out.println(product);
			}
		}
	}
}
