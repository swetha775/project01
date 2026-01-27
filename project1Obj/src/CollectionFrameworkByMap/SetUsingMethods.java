package CollectionFrameworkByMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetUsingMethods 
{
//Hashing (doesn't maintain insertion order)- internally invoke HashMap -> o(1)
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>(al);
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>(50 , 0.75f);
		
		hs.add(21);
		//System.out.println(hs.add(34)); //-> T
		hs.add(34);
		//System.out.println(hs.add(34)); return Boolean value - F
		hs.add(55);
		hs.add(46);
		
		System.out.println(hs1.addAll(hs));
		System.out.println(hs1);
		hs.remove(34);
		hs.contains(34);
		System.out.println(hs1.size());
		hs1.clear();
		System.out.println(hs1.isEmpty());
		//hs.toArray();
		System.out.println(hs.clone()); //Not in Set(Only in HashSet)
		System.out.println(hs);
		
		
		
		 

	}

}
