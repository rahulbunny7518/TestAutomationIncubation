package module4_java8.Task06;

import java.util.Random;
import java.util.function.IntSupplier;

public class Task06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntSupplier randomIntGenearation = () -> new Random().nextInt(5000);
	
		System.out.println("Random integer less than 5000 :"+ randomIntGenearation.getAsInt());
	}

}
