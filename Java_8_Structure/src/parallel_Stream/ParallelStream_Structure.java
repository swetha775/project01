package parallel_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_Structure 
{
	public static void main(String[] args) 
	{
		 List<Integer> list = new ArrayList<>(List.of(2,5,64,7,53,5));
		 
		 list.parallelStream()
		 .filter((x)->x%2 == 0)
		 .forEach(System.out::println);
		 
		 Stream.of("hello","world","venni","hiii","world")
		 .parallel()
		 .map((x)->x.toUpperCase())
		 .forEach(System.out::println);
		 
	}

}
