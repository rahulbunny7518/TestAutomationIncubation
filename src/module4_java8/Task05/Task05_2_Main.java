package module4_java8.Task05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;

public class Task05_2_Main {

	public static void main(String[] args) {
		
		Map<Product, Integer> cart = new HashMap<>();
		
		cart.put(new Product("Laptop", 50000), 2);
		cart.put(new Product("TV", 15000.52), 1);
		cart.put(new Product("Air Cooler", 8000), 3);
		
		BiFunction<Product, Integer, Double> bifunctionTotalCartCost = (product, qty) -> product.getPrice() * qty;
		
		
		double result = cart.entrySet().stream()
				.mapToDouble(t ->bifunctionTotalCartCost.apply(t.getKey(), t.getValue()))
				.sum();
		
		System.out.println("Total cost of cart is :"+ result);
		
		//double result = cart.entrySet().stream().map( t -> t.getKey().price * t.getValue()).reduce(0.0, (a,b) -> a+b);
	
		//System.out.println("Total cost of cart :" + result);
	}

}
