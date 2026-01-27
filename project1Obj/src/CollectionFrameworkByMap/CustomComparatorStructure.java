package CollectionFrameworkByMap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Sample implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		if(o1 < o2)
		{
			return 1;
		}
		else if(o1 > 02)
		{
			return -1;
		}
		return 0;
	}
}

public class CustomComparatorStructure 
{
	public static void main(String[] args)
	{
		Sample custom = new Sample();
		

		PriorityQueue<Integer> pq = new PriorityQueue<>(); 
		pq.add(54);
		pq.add(87);
		pq.add(63);
		pq.add(51);
		System.out.println(pq);
		
		TreeSet<Integer> ts = new TreeSet<>(custom);
		ts.add(54);
		ts.add(87);
		ts.add(63);
		ts.add(51);
		System.out.println(ts);

	}

}
