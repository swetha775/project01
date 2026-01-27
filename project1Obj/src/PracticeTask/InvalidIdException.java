package PracticeTask;

import java.util.InputMismatchException;

public class InvalidIdException extends InputMismatchException
{
	
	public InvalidIdException(String message)
	{
		super(message);
	}

}

