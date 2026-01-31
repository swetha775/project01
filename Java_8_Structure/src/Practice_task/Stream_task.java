package Practice_task;

import java.util.stream.Stream;

public class Stream_task 
{
	public static void main(String[] args) 
	{
		System.out.println("Filter even number:");
		Stream.of(2,5,6,8,9,45,76)
		.filter((t) -> t%2 == 0)
		.forEach(System.out::println);
		
		System.out.println("Convert string to Uppercase:");
		Stream.of("java is a programming language")
		.map((t) -> t.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("Print unique values");
		Stream.of(2,3,5,5,6,7,34,3)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Print top3 smallest number:");
		Stream.of(4,5,8,23,54,9,0)
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("Skip first2 names and print remaining");
		Stream.of("swe","gom","rani","raja","sam")
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println("Print number >5 after doubling");
		Stream.of(4,5,8,23)
		.mapToDouble((t)->t*2)
		.filter((t)->t>5)
		.forEach(System.out::println);
		
		System.out.println("Sort names by length");
		Stream.of("swe","gom","rani","raja")
//		.map((t)->t.length())
		.sorted((a,b)-> a.length()-b.length())
		.forEach(System.out::println);
		
		System.out.println("Extract first character of each word");
		Stream.of("swe","gom","rani","raja")
		.map((t)-> t.charAt(0))
		.forEach(System.out::println);
		
		System.out.println("Convert list of integer to their square,then remove duplicates");
		Stream.of(3,5,7,9,8,9,3)
		.map((t)-> t*t)
		.distinct()
		.forEach(System.out::println);

	}

}
