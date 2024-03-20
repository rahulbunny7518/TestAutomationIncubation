package module4_java8.Task05;

import java.util.function.BiFunction;

public class Task_05_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, Double, Product>  bifuncionForCreate = (name, price) -> new Product(name, price);
		
		Product product = bifuncionForCreate.apply("TV", 15000.45);
		System.out.println(product);

	}

}
