package IterableStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorBothDirection 
{
	//Both Forward and Backward Direction
	
	public static void main(String[] args) 
	{
		List<Integer> list =  List.of(6,33,65,12,9,73,7,6);
		//ArrayList<Integer> al =new ArrayList<>(list);  //insertion order
		
		Vector<Integer> al =new Vector<>(list);
		
		ListIterator<Integer>li = al.listIterator();
		
		while(li.hasNext())
		{
			Integer x = li.next();
			if(x ==12)
			{
				li.add(3);
			}
			if(x == 33)
			{
				li.remove();
			}
			if(x == 9)
			{
				li.set(10);
			}
			
			System.out.println(li.nextIndex());
			li.next();
			
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous()); 
		}

	}

}
