package IterableStructure;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DescendingIterator 
{
     //Descending Order - Only for Navigable Collection 
	
	public static void main(String[] args) 
	{
		//TreeSet
	    Set<Integer> list = Set.of(3,233,4,56,21,6,90);
	    
		TreeSet<Integer> ts = new TreeSet<>(list);
		
		Iterator<Integer> desc = ts.descendingIterator();
		
		while(desc.hasNext()) 
		{
			System.out.println(desc.next());
		}
		
		//Map
		//Iterator cannot support Map. So, we can convert Map to Set.
		Map<Integer , String> map = Map.of( 2 , "two" , 1, "one" , 3 , "Three");
		TreeMap<Integer , String> tm = new TreeMap<>(map);
		
		Set<Integer> s = tm.keySet();
		
		TreeSet<Integer> d = new TreeSet<Integer>(s);
		
		Iterator<Integer> it = d.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collection<String> c = tm.values();
		Iterator<String> ite = c.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		Iterator<Map.Entry<Integer , String>> iterator = tm.entrySet().iterator();
		//Iterator<Map.Entry<Integer , String>> iterator = se.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//ArrayDeque
		List<Integer> li =  List.of(23,3,2,5,76,8,36);
		ArrayDeque<Integer> ar = new ArrayDeque<>(li);
		Iterator<Integer> des = ar.descendingIterator();
		while(des.hasNext())
		{
			System.out.println(des.next());
		}

	}

}
