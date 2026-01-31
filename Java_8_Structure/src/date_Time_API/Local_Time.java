package date_Time_API;

import java.time.Duration;
import java.time.LocalTime;

public class Local_Time 
{

	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now(); //17:20:02.010482600
		LocalTime time1 = LocalTime.of(10, 25, 40); //10:25:40
		LocalTime time2 = LocalTime.parse("10:25:40");
		
		//Instance Methods
		System.out.println(time1.getHour()); //10
		System.out.println(time1.getMinute());
		System.out.println(time1.getSecond());
		System.out.println(time1.plusHours(1)); //11:25:40
		System.out.println(time1.plusMinutes(5)); //10:30:40
		System.out.println(time1.withSecond(35)); //10:25:35
		System.out.println(time1.minusMinutes(10)); //10:15:40
		System.out.println(time1.minusSeconds(4));  //10:25:36
		
		//Supported Class
		LocalTime t1 = LocalTime.of(12, 30);
		LocalTime t2 = LocalTime.of(15, 45);
		
		Duration d = Duration.between(t1, t2);
		
		System.out.println(d.toHours()); //3 
		System.out.println(d.toMinutes()); //195
		System.out.println(d.getSeconds());
		
		Duration d1 = Duration.ofSeconds(30);
		System.out.println(d1); //PT30S
		
		Duration d2 = Duration.ofMinutes(5);
		System.out.println(d2); //PT5M
		
		Duration d3 = Duration.ofHours(4);
		System.out.println(d3); //PT4H
		
		Duration d4 = Duration.ofDays(1);
		System.out.println(d4); //PT24H
		
		
		
		

	}

}
