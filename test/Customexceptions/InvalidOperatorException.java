package test.Customexceptions;

@SuppressWarnings("serial")
public class InvalidOperatorException extends Exception
{
	public InvalidOperatorException(String text)
	{
		super(text);
	}
}
