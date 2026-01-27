package PracticeTask;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidName extends InputMismatchException
{
	public InvalidName(String message)
	{
	super(message);
	}
}
public class Program01 
{
		Scanner scan = new Scanner(System.in);
		
		String[] book = {"moon" , "night" , "stircty" , "star"};
		
		public void addBookName()
		{
			for(int i = 0 ; i<book.length; i++)
			{
				System.out.println(book[i]);
			}

		}
		
		String[] arr = new String[2];
		
		
		public void newBook()
		{
			try {
			System.out.println("Enter New BookName: ");
			String newbook = scan.next();
			
			boolean found = false;
			for(int i = 0 ; i<=book.length; i++)
			{
			if(newbook.equalsIgnoreCase(book[i]))
			{
				found = true;
				break;
			}
			}
			if(found)
			{
				throw new InvalidName("invalid bookname - already exits..");
			}
			else
			{
				System.out.println("Newbook added...");
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		

		public static void main(String[] args) 
		{
			Program01 obj = new Program01();
			obj.addBookName();
			obj.newBook();

			
			
			
		}

	}


