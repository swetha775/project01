package PracticeTask;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		Scanner scan = new Scanner(System.in);
		boolean b = false;
		do
		{
			
		Book.displayOptions();
		
		System.out.println("do you want to continue?(1)");
		int x=scan.nextInt();
		
		b = (x==1)?true:false;

		}while(b);
		
		WriteFile.writeFile();
		
		ReadFile.readFile();
		

	}

}
