package CollectionFrameworkByMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionFactoryMethods 
{

	public static void main(String[] args)
	{
		List<Integer> list =  List.of(23,3,2,5,76,8,36);   //Immutable
		ArrayList<Integer> li  = new ArrayList<>(list);    //Insertion order
		li.add(23);
		System.out.println(li);
		
		List<Integer> l = Arrays.asList(5,8,76,9);       //Fixed Size(Only Possible to exchange)
		l.set(0, 1);
		System.out.println(l);
		
		Set<Integer> s =  Set.of(4,65,3,45,75);        //Immutable
		HashSet<Integer> hs = new HashSet<>(s);        //Hashing  
		hs.add(76);
		System.out.println(hs);
		
		Map<Integer , String> map = Map.of( 2 , "two" , 1, "one" , 3 , "Three"); //Immutable
		TreeMap<Integer,String> tm = new TreeMap<>(map);   //Natural order(min heap)
		tm.put(4, "four");
		System.out.println(tm);
		
		Map.Entry<Integer, String> en = Map.entry(1, "one" ); //Immutable
		
		Map<Integer, String> m =Map.ofEntries(Map.entry(6, "one") , Map.entry(7, "one") , Map.entry(8, "one"));
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(m);
		System.out.println(lhm.pollFirstEntry());
		System.out.println(lhm);

	}

}
