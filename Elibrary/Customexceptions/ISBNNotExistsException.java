package Elibrary.Customexceptions;

@SuppressWarnings("serial")
public class ISBNNotExistsException extends Exception 
{
	public ISBNNotExistsException(String text)
	{
		super(text);
	}
}
