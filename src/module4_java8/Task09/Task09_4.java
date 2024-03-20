package module4_java8.Task09;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class Task09_4 {

	public static void main(String[] args) {
		
		Function<LocalDate, Integer> ageCalculator = birthDate -> Period.between(birthDate, LocalDate.now()).getYears();
			
		LocalDate birthDate = LocalDate.of(1999, 06, 24);
		
		System.out.println("Age is :" + ageCalculator.apply(birthDate));
	}
}