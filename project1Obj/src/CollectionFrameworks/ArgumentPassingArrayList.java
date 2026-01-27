package CollectionFrameworks;

import java.util.ArrayList;
class Sample
{
	public static boolean sortingElement(ArrayList<Integer> arr)
	{
		boolean result = false;
		for(int i = 0 ; i < arr.size() ; i++)
		{
			for(int j = i+1 ; j < arr.size() ; j++)
			{
				if(arr.get(i) < arr.get(j))
				{
					result = true;
				}else {
					result = false;
				}	
			}
		}
		//System.out.println("After Sorted: "+arr);
		return result;
	}
	
	public static ArrayList<Integer> sortArrayList(ArrayList<Integer> arr)
	{ 
		for(int i = 0 ; i < arr.size() ; i++)
		{
			for(int j = i+1 ; j < arr.size() ; j++)
			{
				if(arr.get(i) > arr.get(j))
				{
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
					
				}	
			}
		}
		
		return arr;
	}
	
	public static void minMaxElement(ArrayList<Integer> arr)
	{
		Integer min = 100;
		Integer secmin = 100;
		Integer max = 0;
		Integer secmax = 0;
		
		for(int i = 0 ;i < arr.size() ; i++)
		{
			if(min > arr.get(i))
			{
				secmin = min;
				min = arr.get(i);
			}
			if(arr.get(i) > min && arr.get(i) < secmin)
			{
				secmin = arr.get(i);
			}
		}
		System.out.println("Second minimun value: "+secmin);

		for(int i = 0 ;i < arr.size() ; i++)
		{
		
			if(max < arr.get(i))
			{
				max = arr.get(i);	
			}
			if(arr.get(i) != max && arr.get(i)> max)
			{
				secmax = arr.get(i);
			}
			
			
		}
		System.out.println("Second miximum value: "+secmax);
	}
	
	public static void reverseArray(ArrayList<Integer> arr)
	{
		int i = 0;
		int last = arr.size()-1;
		while(i<arr.size()/2)
		{
			int temp = arr.get(i);
			arr.set(i, arr.get(last));
			arr.set(last, temp);
			i++;
			last--;
		
		}
		
		System.out.println("Reverse Element: "+arr);
	}
	
	public static void moveZeroLeft(ArrayList<Integer> arr)
	{
		int last = arr.size()-1;
		for(int i = 0 ; i <arr.size() ; i++)
		{
			if(arr.get(i) == 0 )
			{
				int temp = arr.get(i);
				arr.set(i, arr.get(last));
				arr.set(last, temp);
			}
			last--;
		}
		System.out.println("Move zero value to Right: "+arr);
	}
	
	public static void moveZeroRight(ArrayList<Integer> arr)
	{
		int last = arr.size()-1;
		for(int i = 0 ; i <arr.size() ; i++)
		{
			if(arr.get(i) != 0 )
			{
				int temp = arr.get(i);
				arr.set(i, arr.get(last));
				arr.set(last, temp);
			}
			last--;
		}
		System.out.println("Move zero value to Right: "+arr);
	}
	
	public static void removeDuplicate(ArrayList<Integer> arr)
	{
		Integer out = 0;
		int last = arr.size()-1;
		for(int i=0 ; i< arr.size(); i++)
		{
			if(arr.get(i) != arr.get(last))
			{
				out = arr.get(i);
			}
			last--;
		}
		System.out.println(arr);
	}
	
	
	
	
	
}
public class ArgumentPassingArrayList
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrs = new ArrayList<>();
		arrs.add(12);
		arrs.add(2);
		arrs.add(16);
		arrs.add(9);
		arrs.add(10);
		arrs.add(0);
		arrs.add(0);
		arrs.add(16);
		arrs.add(10);
		
		boolean res = Sample.sortingElement(arrs);
		System.out.println(res);
		
		ArrayList<Integer>res1 = Sample.sortArrayList(arrs);
		System.out.println("Sorted ArrayList: "+res1);
		
		Sample.minMaxElement(arrs);
		
		Sample.reverseArray(arrs);
		
		Sample.moveZeroLeft(arrs);
		
		Sample.moveZeroRight(arrs);
		
		Sample.removeDuplicate(arrs);
		

	}

}
