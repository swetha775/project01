package date_Time_API;

import java.time.LocalDate;

public class Calender_Task
{
	public static void main(String[] args) 
	{
		int year = 2008;
		
		for(int month  = 1 ; month <= 12 ; month++)
		{
			LocalDate date = LocalDate.of(year, month, 1);
			System.out.println(date.getMonth());
			
			int dayMonth = date.lengthOfMonth();
			
			for(int day =1 ; day <= dayMonth ; day++)
			{
			LocalDate date1 = LocalDate.of(year, month, day);
			System.out.println(date1);
			}
		}
	}

}
