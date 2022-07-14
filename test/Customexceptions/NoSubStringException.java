package test.Customexceptions;

@SuppressWarnings("serial")
public class NoSubStringException extends Exception
{
	public NoSubStringException(String text)
	{
		super(text);
	}
}
