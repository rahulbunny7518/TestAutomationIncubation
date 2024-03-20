package module4_java8.Task09;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Task09_1 {

	public static void main(String[] args) {
	
		Predicate<LocalDate> yesterdayOrNot = date -> date.equals(LocalDate.now().minusDays(1));
		
		LocalDate inputDate = LocalDate.now().minusDays(1);
		
		System.out.println(inputDate+" is yesterday ? "+ yesterdayOrNot.test(inputDate));
	}
}
