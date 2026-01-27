package CollectionFrameworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveArrayList 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Scanner scan = new Scanner(System.in);
		
		File file = new File("C:\\java Notes\\FileHandling\\class.ser");
		
		ArrayList<Products> product = new ArrayList<>();
		
		System.out.println("Enter Number of Products: ");
		int n = scan.nextInt();
		
		for(int i=0 ; i< n ; i++) 
		{
			System.out.println("Entre ID: ");
			int id = scan.nextInt();
			
			System.out.println("Enter ProductName: ");
			String productName = scan.next();
			
			System.out.println("Enter Category:");
			String category = scan.next();
			
			System.out.println("Enter Price");
			long price = scan.nextLong();
			
			product.add(new Products(id , productName , category , price));
			
		}
		
		try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(file)))
		{
			oss.writeObject(product);
			System.out.println("The Products has been serialized");
		}
		catch(IOException e)
		{
			e.getMessage();
		}

	}

}
