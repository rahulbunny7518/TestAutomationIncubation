package module4_java8.Task04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Consumer {
	
	public static void printProduct(Product product, String printParam) {
		if(printParam.equalsIgnoreCase("File")) {
			try (FileWriter fileWriter = new FileWriter("product.log")){
				fileWriter.write(product.toString());
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(product.toString());
		}
	}
	
	public static void updateGrade(List<Product> products) {
		for(Product product: products) {
			if(product.getPrice() > 1000) {
				product.setGrade("Premium");
			}
		}
		printProducts(products);
	}
	
	public static void updateName(List<Product> products) {
        for (Product product : products) {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        }
        printProducts(products);
    }
	
	public static void printPremiumProducts(List<Product> products) {
        for (Product product : products) {
            if (product.getGrade().equalsIgnoreCase("Premium") && product.getName().endsWith("*")) {
                System.out.println(product.toString());
            }
        }
    }

    private static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }	
}