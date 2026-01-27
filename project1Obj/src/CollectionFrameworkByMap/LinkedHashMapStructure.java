package CollectionFrameworkByMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapStructure
{

	public static void main(String[] args) 
	{
		//HashMap<String , Integer> hm = new HashMap<>();  //Conversion Type Using Constructor
		
		LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>(16 , 0.75f , true);
		
		lhm.put("AA", 32);
		lhm.put("AB", 98);
		lhm.put("AC", 65);
		//hash Collision
		lhm.put("Ea", 32);
		lhm.put("FB", 24);
		
		System.out.println(lhm.getOrDefault("EE", 0));
		System.out.println(lhm.get("FB"));
		
		System.out.println(lhm);
		
		//Access Order -> frequently used key get in tail.
		lhm.get("AB");
		System.out.println(lhm);
		
		
		
		
		
	}

}
