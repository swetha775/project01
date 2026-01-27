package CollectionFrameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadArrayList 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void sortedArray(ArrayList<Products> readList)
	{
		for(int i=0 ; i<readList.size() ; i++)
		{
			for(int j=i+1 ; j<readList.size() ; j++)
			{
				String name1 = readList.get(i).getproductName();
				String name2 = readList.get(j).getproductName();
				if(name1.compareToIgnoreCase(name2)>0)
				{
					Products temp = readList.get(i);
					readList.set(i, readList.get(j));
					readList.set(j, temp);
				}
			}
		}
		System.out.println("The Given ArrayList are Sorted: "+readList);
	}
	
	public static void displayProductByCategory()
	{
		System.out.println("Enter Category: ");
		String category = scan.next();
		
		System.out.println("Enter the option:");
		int ch = scan.nextInt();
		
		switch(ch)
		{
		
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		File file = new File("C:\\java Notes\\FileHandling\\class.ser");
		
		ArrayList<Products> readList = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
		{
			readList = (ArrayList<Products>) ois.readObject();
			System.out.println("Deserialzed products");
			for(Products product : readList)
			{
				product.display();
			}
		}catch(ClassNotFoundException e)
		{
			e.getMessage();
		}
		
		sortedArray(readList);
		

	}

}
