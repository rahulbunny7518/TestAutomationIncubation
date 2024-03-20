package module4_java8.Task02_Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task02_1 {
	public static void main(String[] args) {
		
		Predicate<Product> predicate = (product) ->{
			return product.getPrice() > 1000;
		};
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("apple", 1200,"ab", 10));
		list.add(new Product("banana", 800,"cd", 8));
		list.add(new Product("pineapple", 1400,"ef", 9));
		list.add(new Product("grapes", 1100.45,"gh", 6));
		
		for(Product product : list) {
			if(predicate.test(product)) {
				System.out.println(product);
			}
		}
		
	}
}
