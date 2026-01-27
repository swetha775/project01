package PracticeTask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile
{
	public static void writeFile()
	{
        File file = new File("C:\\java Notes\\FileHandling\\sample.ser");
		
		try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(file)))
		{
			oss.writeObject(Emp.book);
			System.out.println("The Products has been serialized");
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

}
