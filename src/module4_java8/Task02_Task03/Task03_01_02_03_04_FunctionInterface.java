package module4_java8.Task02_Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


@FunctionalInterface
interface CostCalculator {
    double calculate(List<Product> products);
}


public class Task03_01_02_03_04_FunctionInterface {

	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("apple", 1200,"electronics", 10));
		products.add(new Product("banana", 50,"electronics", 8));
		products.add(new Product("pineapple", 1400,"electronics", 9));
		products.add(new Product("grapes", 1.45,"ab", 6));
		
		CostCalculator costOfAllProducts = productsList -> productsList.stream().mapToDouble(t-> t.getPrice()).sum();
		System.out.println("Total Cost of all products :"+ costOfAllProducts.calculate(products));
		
		
		CostCalculator costOfProductsMoreThan1000 = productList -> productList.stream().filter(t -> t.getPrice()>1000).mapToDouble( t-> t.getPrice()).sum();
		System.out.println("Products Costs above 1000 :"+ costOfProductsMoreThan1000.calculate(products));
		
		CostCalculator costOfElectronicProducts = productList -> productList.stream().filter(t -> t.getCategory().equalsIgnoreCase("electronics")).mapToDouble(t -> t.getPrice()).sum();
		System.out.println("Cost of Electronic Products :"+ costOfElectronicProducts.calculate(products));
		
		List<Product> above1000AndElectronicProducts = products.stream().filter(product -> product.getPrice() > 1000 && product.getCategory().equalsIgnoreCase("electronics")).collect(Collectors.toList());
        System.out.println("Products with price > 1000 and belong to electronics category: " + above1000AndElectronicProducts);
	}

}
