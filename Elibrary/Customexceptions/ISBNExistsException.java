package Elibrary.Customexceptions;

@SuppressWarnings("serial")
public class ISBNExistsException extends Exception 
{
	public ISBNExistsException(String text)
	{
		super(text);
	}
}
