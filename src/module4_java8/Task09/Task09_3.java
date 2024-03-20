package module4_java8.Task09;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.function.Supplier;

public class Task09_3 {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> dateTimeInESTZone = () -> LocalDateTime.now(ZoneId.of("America/New_York"));
		
		LocalDateTime currentDateTimeInESTZone = dateTimeInESTZone.get();
		
		System.out.println("Present date time in EST :"+currentDateTimeInESTZone);

	}

}
