package collect_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Collector_Interface 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>(List.of("one","two","three","four"));
		
		Collector<String , StringBuilder ,String>collect = Collector.of(
				() -> new StringBuilder(),
				(sb , x) -> sb.append(x),
				(s1,s2) -> 
				{
					s1.append(s2);
					return s1;
				}, 
				s -> s.toString()
				);
		
		String s = list.stream().collect(collect);
		System.out.println(s);
		
		List<Integer> list1 = new ArrayList<>(List.of(2,4,6,5,43,76,5));
		
//		Collector.of(
//				() ->new ArrayList<Integer>() ,
//				(arr,element) -> {
//					if(arr.size() ==0)
//					arr.add(element);  //2
//					int sum = arr.get(0) + element;
//					arr.set(0, sum);
//				},
//				(arr1,arr2) -> 
//				{
//					arr1.g
//				}, null)
		list1.stream().collect(null);

	}

}
