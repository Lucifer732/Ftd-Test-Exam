package test.Customexceptions;

import test.classes.*;
public class source 
{
	public String handleException(Activity ac) throws NullPointerException
	{
		if(ac.str1=="null" && ac.str2=="null")
		{
			throw new NullPointerException("Null Values Found");
		}
		else if(ac.str1=="null")
		{
			throw new NullPointerException("Null Value Found in string str1");
		}
		else if(ac.str2=="null")
		{
			throw new NullPointerException("Null Value Found in string str2");
		}
		else
		{
			throw new NullPointerException("No Exception Found");
		}
	}
	public String doOperation(Activity ac) throws NoSubStringException,InvalidOperatorException
	{
		switch(ac.ope.charAt(0))
		{
			case '+': return ac.str1+ac.str2;
			case '-': subtraction(ac.str1, ac.str2);			
			default: throw new InvalidOperatorException("Invalid Operator");
		}
	}
	String subtraction(String s1, String s2) throws NoSubStringException
	{
		if(s1.length()>s2.length())
		{
			int i=s1.indexOf(s2);
			if(i==-1)
			{
				throw new NoSubStringException("String str2 is not present in strig s1");
				
			}
			else
			{
				return s1.replace(s2,"");
			}
		}
		else
		{
			int i=s2.indexOf(s1);
			if(i==-1)
			{
				throw new NoSubStringException("String str1 is not present in string s2");
				
			}
			else
			{
				return s2.replace(s1,"");
			}
		}
		
	}
}
