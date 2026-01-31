package date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Local_Date 
{
	public static void main(String[] args) 
	{
		//Static Methods
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2004, Month.AUGUST, 4);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2025-11-29");
		System.out.println(d3);
		
		//Instance Methods
		int s = d2.getYear();
		System.out.println(s);
		
		Month month = d2.getMonth();
		System.out.println(month);
		System.out.println(month.getValue());
		System.out.println(d2.getMonthValue());
		System.out.println(d2.getDayOfMonth());
		System.out.println(d2.getDayOfWeek());
		
		System.out.println(d2.isLeapYear());
		
		System.out.println(d2.lengthOfMonth()); //31
		
		System.out.println(d2.lengthOfYear());//366
		
		LocalDate l = d2.plusDays(3);
		System.out.println(l); //2004-08-07
		
		LocalDate lo = d2.minusDays(1);
		System.out.println(lo); //2004-08-03
		
		LocalDate loc = d2.minusMonths(3);
		System.out.println(loc); //2004-05-04
		
		LocalDate date = d2.withDayOfMonth(14);
		System.out.println(date);//2004-08-14
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld =LocalDate.parse("28/11/2025", dtf);
		System.out.println(ld.format(dtf));

	}

}
