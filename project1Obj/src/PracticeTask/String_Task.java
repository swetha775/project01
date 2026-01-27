package PracticeTask;

import java.util.Arrays;

public class String_Task 
{
	public static void main(String[] args) 
	{
		String str = "Java Programming Language java";
		String str1 = " ";
		int count = 0;
		
		String[] arr = str.split(" ");
		
		for(int i=0;i< arr.length;i++)
		{	
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
			}
			
			if(count > 1)
			{
			System.out.println(arr[i]+"="+count);
			}
		}
		
		//task-2
		int count1 = 0;
		for(int i=0;i< str.length();i++)
		{
			char c = str.charAt(i);
			if(str.indexOf(c) != str.lastIndexOf(c))
			{
				count1++;
			}
			
		}
	

	}

}
