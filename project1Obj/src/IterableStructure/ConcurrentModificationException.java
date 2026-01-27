package IterableStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException 
{
    //During Iteration directly changes in Collection Classes(Occur any Structural Modification)->throw ConcurrentModificationException 
	public static void main (String[] args) 
	{
		List<Integer> li =  List.of(23,3,2,5,76,8,36);
		ArrayList<Integer> al = new ArrayList<>(li);   //Fail Fast
		
		CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>(al);  //Fail Safe
		
		ListIterator<Integer> it =copy.listIterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			if(it.nextIndex() == 4)
			{
			copy.add(1 , 9);
			}
			
			//System.out.println(x);
		}
		System.out.println(copy);
		
		
		HashSet<Integer> ap = new HashSet<>(List.of(23,3,2,5,76,8,36));	
		//ConcurrentSkipListSet<Integer> c = new ConcurrentSkipListSet<>(ap);
		Iterator<Integer> ite = ap.iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
			ap.add(9);
		}
		
		System.out.println(ap);
		
//		Map<Integer , String> map = Map.of( 2 , "two" , 1, "one" , 3 , "Three");
//		
//		Set<Map.Entry<Integer,String>>s = map.entrySet();
//		Iterator<Map.Entry<Integer,String>>i =  s.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		

	}

}
