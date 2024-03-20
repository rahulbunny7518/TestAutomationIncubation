package module4_java8.Task04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		for(int i =0; i<4; i++) {
			products.add(Supplier.generateRandomProduct());
		}
		System.out.println(products);
		System.out.println();
		
		System.out.println("Random OTP :" +Supplier.generateRandomOTP());
		System.out.println();
		
		Consumer.printProduct(products.get(0), "File");
		System.out.println();
		Consumer.printProduct(products.get(1), "Abcd");
		System.out.println();
		
		Consumer.updateGrade(products);
		System.out.println();
		Consumer.updateName(products);
		System.out.println();
		Consumer.printPremiumProducts(products);

	}

}
