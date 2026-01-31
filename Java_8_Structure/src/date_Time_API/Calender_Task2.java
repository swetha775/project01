package date_Time_API;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calender_Task2 
{
	public static void main(String[] args) 
	{
		int year = 2025;
		
		for(int month = 1 ; month <= 12 ; month++)
		{
			LocalDate date = LocalDate.of(year, month, 1);
			System.out.println("Month: "+date.getMonth());
			
			System.out.println("MON\tTUE\tWED\tTHR\tFRI\tSAT\tSUN");
			
			DayOfWeek day = date.getDayOfWeek();
			int value = day.getValue();
			
			for(int i=1 ; i < value ; i++)
			{
				System.out.print("\t");
			}
			
			int lengthmon = date.lengthOfMonth();
			for(int i=1 ; i <=lengthmon ; i++)
			{
				LocalDate date1 = LocalDate.of(year, month, i);
				DayOfWeek day1 =date1.getDayOfWeek();
				
				if(day1 == DayOfWeek.SUNDAY)
				{
					System.err.println(i+"\t");
				}
				else {
				System.out.print(i+"\t");
				}
			}
			System.out.println();
		}
	}
}
