package test;

import java.util.*;

import test.classes.*;
import test.Customexceptions.*;
import test.Customexceptions.NullPointerException;

public class Main 
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String op = sc.next();
			Activity ac = new Activity(s1, s2, op);
			source s = new source();
			try
			{
				System.out.println(s.handleException(ac));
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
			try
			{
				System.out.println(s.doOperation(ac));
			}
			catch(NoSubStringException n)
			{
				System.out.println(n.getMessage());
			}
			catch(InvalidOperatorException i)
			{
				System.out.println(i.getMessage());
			}
		}
	}
}
