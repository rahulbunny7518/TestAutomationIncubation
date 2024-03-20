package module4_java8.Task09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Task09_2 {

	public static void main(String[] args) {
		
		Supplier<LocalDate> findNextThursday = () ->{
			LocalDate todayDate = LocalDate.now();
			
			int daysUntilNextThursday = DayOfWeek.THURSDAY.getValue() - todayDate.getDayOfWeek().getValue();
			
			if (daysUntilNextThursday <= 0) {
				daysUntilNextThursday += 7;
			}
			
			return todayDate.plusDays(daysUntilNextThursday);
		};
		
		LocalDate dateOfNextThursday = findNextThursday.get();
		
		System.out.println("Date of next thusday :"+ dateOfNextThursday);
	}
}
