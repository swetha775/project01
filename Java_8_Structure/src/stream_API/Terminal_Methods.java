package stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Terminal_Methods 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>(List.of(5,3,65,78,8,56,4));
		
		List<Integer> l = list.stream().sorted().toList();
		System.out.println(l); //[3, 4, 5, 8, 56, 65, 78]
		
		Integer in = list.stream().min((a,b) -> a-b).get();
		System.out.println(in); //3
		
		Integer i = list.stream().max((a,b) -> a-b).get();
		System.out.println(i); //78
		
		Integer i1 = list.stream().findFirst().get();
		System.out.println(i1); //5
		
		Integer i2 = list.stream().findAny().get();
		System.out.println(i2); //5
		
		Long i3 = list.stream().filter((x)->x%2==0).count();
		System.out.println(i3); //4
		
		Integer i4 = list.stream().reduce(0, (x,y) -> x+y);
		System.out.println(i4); //219
		String str = Stream.of("hello","world").reduce("", (x,y)->x+" "+y);
		System.out.println(str.trim());
		
		boolean b = Stream.of(2,4,6,8,12).allMatch((x)->x%2==0);
		System.out.println(b); //true
		
		boolean b1 = Stream.of(2,4,9,8,12).anyMatch((x)->x%2==0);
		System.out.println(b1); //true
		
		boolean b2 = Stream.of(3,3,3,3,3,3).noneMatch((x)->x%2==0);
		System.out.println(b2); //true
		
		//Sum Multi-dimensional List
		
		List<Integer> l1 = new ArrayList<>(List.of(3,4,8,6,7));
		List<Integer> l2 = new ArrayList<>(List.of(11,12,13,14,15));
		List<Integer> l3 = new ArrayList<>(List.of(16,17,18,19,20));
		
		List<List<Integer>> lis = new ArrayList<>();
		lis.add(l1);
		lis.add(l2);
		lis.add(l3);
		
		Integer res = lis.stream().flatMap((x)->x.stream()).reduce(0, (x,y)->x+y);
		System.out.println(res); //183
		
		//Stream to Array
		Object[] arr = Stream.of("A","B","C","D").toArray();
		System.out.println(Arrays.toString(arr)); //it return only object[]
		
		for(Object ob : arr)
		{
			String sr = (String)ob;  //By using downcast (we convert string)
			sr=sr.toLowerCase();
			System.out.println(sr);
		}
		
		String[] s = Stream.of("E","F","G","H").toArray((x) -> new String[x]);
		System.out.println(Arrays.toString(s));
		
		//List to Array
		List<Integer> li = new ArrayList<>(List.of(2,3,4,5,6));
		Integer[] integer =li.stream().toArray((x)->new Integer[x]);
		System.out.println(Arrays.toString(integer));
		
		//Set to Array
		Set<String> set = new HashSet<>(Set.of("star","comedy","hlo"));
		String[] strin = set.stream().toArray((x) -> new String[x]);
		System.out.println(Arrays.toString(strin));

	}

}
