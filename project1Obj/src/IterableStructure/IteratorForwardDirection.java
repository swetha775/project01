package IterableStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class IteratorForwardDirection 
{
    // Iterator have hasNext() , next() , remove().
	public static void main(String[] args) 
	{
		// Only Forward Direction 
		
		List<Integer> list =  List.of(23,3,2,5,76,8,36);
		//ArrayList<Integer> al =new ArrayList<>(list);   //Insertion order
		
		PriorityQueue<Integer> al = new PriorityQueue<>(list); //Natural order
		
		//HashSet<Integer> al =new HashSet<>(list);  //Hashing(Unorder)
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			Integer x = it.next();  //Fetch elements
			if(x==3)
			{
			it.remove();
			
			}
		}
		System.out.println(al);

	}

}
