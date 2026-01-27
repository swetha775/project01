package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Vector;

class Thread1 implements Runnable
{
	Vector<Integer> arr;
	
	public Thread1(Vector<Integer> arr)
	{
		this.arr = arr;
	}
	

	@Override
	public void run()
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
		System.out.println("The given Vectorarray is Sorted..");
	}	
}

class Thread2 implements Runnable
{
	Vector<Integer> arr;
	
	public Thread2(Vector<Integer> arr)
	{
		this.arr = arr;
	}
	
	@Override
	public void run()
	{
		System.out.println(arr);		
	}
}

class Thread3 implements Runnable
{
	
	ArrayList<Integer> arr2;
	public Thread3(ArrayList<Integer> arr2)
	{
		this.arr2 = arr2;
	}

	@Override
	public void run()
	{
		for(int i=0 ; i<5 ; i++) 
		{
			System.out.println("three");
		}		
	}	
}

class Thread4 implements Runnable
{
	
	ArrayList<Integer> arr2;
	public Thread4(ArrayList<Integer> arr2)
	{
		this.arr2 = arr2;
	}

	@Override
	public void run()
	{
		for(int i=0 ; i<5 ; i++) 
		{
			System.out.println("four");
		}		
	}
	
	
}
public class VectorCoreMethods
{

	public static void main(String[] args)
	{
		Vector<Integer> arr = new Vector<>();
		
		arr.add(32);
		arr.add(43);
		arr.add(64);
		arr.add(23);
		arr.add(13);
		
		
		Thread1 th1 = new Thread1(arr);
		Thread2 th2 = new Thread2(arr);
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		Thread3 th3 = new Thread3(arr2);
		Thread4 th4 = new Thread4(arr2);
		
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		
		t3.start();
		t4.start();
		
		
		/*Vector<Integer> arr = new Vector<>();
		
		arr.add(21);
		arr.add(23);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		arr.add(33);
		System.out.println(arr.capacity());
		arr.add(23);
		System.out.println(arr.capacity());
		arr.trimToSize();
		System.out.println(arr.capacity());
		arr.ensureCapacity(30);
		System.out.println(arr.capacity());
		
		/*
		arr.addElement(21);
		arr.addElement(11);
		System.out.println(arr);
		//arr.removeElementAt(1);  //[21]
		//arr.removeAllElements(); //[]
		arr.removeElement((Integer)11); //[21]
		arr.insertElementAt(13, 1);  //[21,13]
		arr.setElementAt(56, 0);//[56,13]
		System.out.println(arr);
		System.out.println(arr.elementAt(1));
		System.out.println(arr.firstElement());
		System.out.println(arr.lastElement());
		*/
	}

}
