package date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Local_Date_Time 
{

	public static void main(String[] args) 
	{
		//Static Methods
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //2025-12-02T17:37:06.239740700
		
		LocalDateTime ldt1 = LocalDateTime.of(2004, Month.JANUARY, 24, 17, 5); //2004-01-24T17:05
		System.out.println(ldt1);
		
//		LocalDateTime ldt2 = LocalDateTime.parse("2004, Month.JANUARY, 24, 17, 5,4");
//		System.out.println(ldt2);
		
		//Instance Methods
		System.out.println(ldt1.getYear());
		System.out.println(ldt1.getMinute());
		System.out.println(ldt1.getMonth());
		System.out.println(ldt1.getMonthValue());
		System.out.println(ldt1.getDayOfMonth());
		System.out.println(ldt1.plusHours(2));
		System.out.println(ldt1.withDayOfYear(20));
		System.out.println(ldt1.withHour(21));
		
		String str = ldt1.format(DateTimeFormatter.ISO_DATE_TIME);
		String str1 = ldt1.format(DateTimeFormatter.ISO_DATE);
		System.out.println(str);
		
		//DataTimeFormatting
		LocalDate parsed = LocalDate.parse("21\08\2025", DateTimeFormatter.ofPattern("21\08\2025"));
		System.out.println(parsed);

	}

}
