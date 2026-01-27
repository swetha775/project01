package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionCoreMethods 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(21);
		arr.add(22);
		arr.add(23);
		arr.add(24);
		arr.add(25);
		
		//System.out.println(arr.size()); //5
		//System.out.println(arr.isEmpty()); //false
		//System.out.println(arr.contains(21)); //true
		
		Object[] obj = arr.toArray();
		System.out.println(Arrays.toString(obj));
		
		

	}

}
