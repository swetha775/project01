package CollectionFrameworkByMap;

import java.util.Comparator;
import java.util.TreeSet;

public class SetUsingTreeSet 
{

	public static void main(String[] args)
	{
		Comparator<Integer> custom = new Comparator<>()
				{
					@Override
					public int compare(Integer o1, Integer o2)
					{
						if(o1 < o2)
						{
							return 1;
						}
						else if(o1 > o2)
						{
							return -1;
						}
						return 0;
					}
			
				};
		
		TreeSet<Integer> ts = new TreeSet<>(custom);
		
		ts.add(22);
		ts.add(65);
		ts.add(2);
		ts.add(9);
		ts.add(74);
		
		System.out.println(ts.ceiling(65)); // 65 (>=)
		System.out.println(ts.higher(65)); //74  (>)
		System.out.println(ts.lower(65));  //22 (<)
		System.out.println(ts.first());  //2
		System.out.println(ts.last());  //74
		System.out.println(ts.floor(9)); //9 (<=)
		System.out.println(ts.headSet(22)); //[2, 9]
		System.out.println(ts.tailSet(22)); //[22, 65, 74]
		System.out.println(ts.subSet(9, 65));  //[9, 22]
		
		System.out.println(ts); //Sorted Order -> it implements Comparable. [2, 9, 22, 65, 74]
		
		//System.out.println(ts); //custom in Descending Order -> it overrides Comparator.[74, 65, 22, 9, 2]

	}

}
