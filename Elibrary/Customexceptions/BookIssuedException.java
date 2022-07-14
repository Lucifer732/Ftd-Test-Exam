package Elibrary.Customexceptions;

@SuppressWarnings("serial")
public class BookIssuedException extends Exception 
{
	public BookIssuedException(String text)
	{
		super(text);
	}
}
