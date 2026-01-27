package PracticeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Emp
{
	static Scanner scan = new Scanner(System.in);
	
	static ArrayList<Book> book = new ArrayList<>();
	
	public static void createBook()
	{
		System.out.println("Enter Number of Books: ");
		int n = scan.nextInt();
		
		for(int i=0 ; i< n ; i++) 
		{
			System.out.println("Entre ID: ");
			int id = scan.nextInt();
			
			System.out.println("Enter BookName: ");
			String bookName = scan.next();
			
			System.out.println("Enter AuthorName: ");
			String authorName = scan.next();
			
			System.out.println("Enter PublishingYear: ");
			long publishingYear = scan.nextLong();
			
			book.add(new Book(id , bookName , authorName , publishingYear));
			
		}
	}
	
	public static void removeById()
	{
		
		System.out.println("Enter Deleting id:");
		int id = scan.nextInt();
		
		Book temp = null;
		
		for(Book b : book)
		{
			if(b.getId() == id)
			{
				temp = b;
				break;
			}
		}
		if(temp != null) 
		{
			book.remove(temp);
			System.out.println("Given id object is deleted...");
			System.out.println(book);
		}else {
			throw new InvalidIdException("Invalid id....");
		}
		
	}
	
	
	public static void sortingBookName()
	{
		Comparator<Book> custom = new Comparator<>()
		{

			@Override
			public int compare(Book o1, Book o2) 
			{
				return o1.getBookName().compareToIgnoreCase(o2.getBookName());
			}
			
		};
		
		Collections.sort(book, custom);
		System.out.println(book);
		System.out.println("The BookName was Sorted...");
		Iterator<Book> it = book.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		
	}
	
	public static void updateUsingBookName()
	{
		System.out.println("Update by using Id: ");
		int id = scan.nextInt();
		
		for(Book b : book)
		{
			if(b.getId() == id)
			{
				System.out.println("new id: ");
				b.setId(scan.nextInt());
				System.out.println("updated..");
			}
			System.out.println(b);
			
		}
	}
	
	public static void getByAuthorName() 
	{
		System.out.println("Fetch AuthorName");
		String au = scan.next();
		
		for(Book b : book)
		{
			if(b.getAuthorName().equalsIgnoreCase(au))
			{
				System.out.println(b);
				break;
			}
			else
			{
				throw new InvalidBookName("Invalid AuthorName....");
			}
		}	
		
	}
}
