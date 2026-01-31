package stream_API;

import java.util.stream.Stream;

public class Intermediate_Methods
{

	public static void main(String[] args) 
	{	
		//Intermediate Methods -(Chained Method calling)
		Stream.of("hello","world","venni","hiii","world")
		.sorted((o1 , o2) -> o1.compareToIgnoreCase(o2))
		.sorted()
		.filter((x)-> x.length() == 5)
		.map((x) -> x.length())
//		.mapToInt((x) -> x.length()) //Only allowed integer
		.distinct()
		.limit(2)
		.skip(1)
		.forEach(System.out::println);
		
		
		

	}

}
