package CollectionFrameworkByMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyUsingHashMap 
{

	public static void main(String[] args) 
	{
		/*ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(8);
		al.add(24);
		al.add(14);
		al.add(12);
		al.add(8);
		
		LinkedHashMap<Integer , Integer> hm = new LinkedHashMap<>();
		
		for(Integer i : al)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}*/
		
		
		String s = "hello java programming";
		String[] arr = s.split("");
		
		HashMap<String , Integer> hm = new HashMap<>();
		for(String i : arr)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<String, Integer> en : hm.entrySet())
		{
			System.out.println(en.getKey()+" - "+en.getValue());
		}

	}

}
