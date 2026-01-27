package CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeueMethods 
{

	public static void main(String[] args)
	{
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(21);              
		dq.add(21);               //Allow Duplicates     
		dq.offer(54);
		dq.add(null);
		System.out.println(dq);   //[21, 21, 54] - Insertion Order
		
		dq.offerFirst(65);
		dq.addLast(23);
		System.out.println(dq);   //[65, 21, 21, 54, 23]
		
		dq.remove();
		dq.removeFirst();
		dq.pollLast();
		System.out.println(dq);   //[21, 54]
		
		System.out.println(dq.peekFirst());  //21
		System.out.println(dq.peekLast());   //54
		System.out.println(dq);              //[21, 54]
		
		
		
		
		

	}

}
