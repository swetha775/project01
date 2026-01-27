package PracticeTask;

import java.util.InputMismatchException;

public class InvalidBookName extends InputMismatchException
{
	public InvalidBookName(String message)
	{
		super(message);
	}

}
