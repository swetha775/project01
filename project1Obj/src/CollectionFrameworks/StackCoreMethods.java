package CollectionFrameworks;

import java.util.Stack;

public class StackCoreMethods 
{

	public static void main(String[] args) 
	{
		Stack<Integer> arr = new Stack<>();  //Default Constructor - cannot convert
		arr.push(23);
		arr.push(22);
		arr.push(5);
		arr.push(65);
		arr.push(44);
		
		System.out.println(arr);
		
		//System.out.println(arr.peek());
		System.out.println(arr.pop());
		System.out.println(arr);

	}

}
