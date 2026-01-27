package CollectionFrameworks;

import java.util.LinkedList;

public class LinkedListCoreMethod 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> arr = new LinkedList<>();
		arr.add(12);
		arr.add(23);
		arr.add(43);
		arr.addFirst(32);
		arr.addLast(54);
		//arr.removeFirst();
		//arr.removeLast();
		arr.remove();
		
		System.out.println(arr);

	}

}
