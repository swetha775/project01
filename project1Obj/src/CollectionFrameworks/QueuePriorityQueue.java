package CollectionFrameworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new PriorityQueue<>();// Every Generic should implements Comparable. So, it follow Natural Order(min-heap).
		
		q.add(17);
		q.add(20);
		q.add(25);
		q.add(6);
		q.add(7);
		q.add(1);
		
		System.out.println(q); //[1, 7, 6, 20, 17, 25] - Follow Natural Order(min-heap internally invoke Self Balancing Tree)
		//q.offer(23);           
		System.out.println(q); //[1, 7, 6, 20, 17, 25, 23]
		
		System.out.println(q.remove()); //1
		System.out.println(q); //[6, 7, 23, 20, 17, 25]
		
		System.out.println(q.poll());  //6
		System.out.println(q); //[7, 17, 23, 20, 25]
		
		System.out.println(q.peek()); //7
		System.out.println(q); //[7, 17, 23, 20, 25]
		
		System.out.println(q.element());
		System.out.println(q);
		
		Queue<Character> c = new PriorityQueue(); 
		c.add('Z');
		c.add('A');
		c.add('B');
		
		System.out.println(c.remove()); //A
		System.out.println(c); //[B, Z] - it also follow Natural Order
		


	}

}
