package PracticeTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFile 
{
			public static void readFile() throws FileNotFoundException, IOException
		{
		
		File file = new File("C:\\java Notes\\FileHandling\\sample.ser");
		
		ArrayList<Book> readList = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
		{
			readList = (ArrayList<Book>) ois.readObject();
			System.out.println("Deserialzed products");
			
			for(Book bk : readList)
			{
				System.out.println(bk);
			}
		}catch(ClassNotFoundException e)
		{
			e.getMessage();
		}
		

	}

}
