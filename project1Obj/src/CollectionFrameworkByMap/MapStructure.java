package CollectionFrameworkByMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapStructure 
{

	public static void main(String[] args) 
	{
		Map<String , Integer> map = new HashMap<>();
		
		map.put("AA", 88);
		map.put("BB", 54);
		map.put("JJ", 98);
		
		//map.putAll(map);
		
		//System.out.println(map.get("BB"));
		
		//System.out.println(map.remove("AA"));
		
		//System.out.println(map.containsKey("JJ"));
		
		//System.out.println(map.containsValue(98));
		
		//System.out.println(map.keySet());
		for(String s : map.keySet())
		{
			System.out.println(s);
		}
		
		//System.out.println(map.values());
		for(Integer value : map.values())
		{
			System.out.println(value);
		}
		
		//System.out.println(map.entrySet());
		for(Entry<String, Integer> kv : map.entrySet())
		{
			System.out.println(kv);
		}
		
		System.out.println(map.size());
		
		//map.clear();
		
		System.out.println(map.isEmpty());
	
		
		System.out.println(map);
		
		Map<String , String> map1 = new HashMap<>();
		
		//hash Collision -> Same hashCode -> to store same Bucket -> if same Key,it will override value.
		map1.put("Ea", "star");
		map1.put("FB", "night");
		//System.out.println("Ea".hashCode()%16); //12
		
		System.out.println(map);
		System.out.println(map.get("FB"));
		
		
		/*map.put("sun", "name1");
		map.put("star", "name1");
		map.put("null", "name1");
		map.put("earth", "name1");
		map.put("erar", "name1");
		map.put("bojh", "name1");
		map.put("vcft", "name1");
		map.put("iknv", "name1");
		map.put("wscg", "name1");
		map.put("olkh", "name1");
		map.put("plku", "name1");
		map.put("edtg", "name1");
		map.put("ytghu", "name1");
		
		System.out.println(map);
		*/

	}

}
