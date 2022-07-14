package Elibrary.Inventorycontoller;

import java.util.*;

import Elibrary.Customexceptions.*;
import Elibrary.Inventory.*;
import Elibrary.Book.*;

public class InventoryController
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter No.of Books:");
		int n=sc.nextInt();
		List<Book> b= new ArrayList<>();
		List<BookIssue> bi = new ArrayList<>();
		try
		{
			BookInventory.addBooks(b, n);
		}
		catch(ISBNExistsException e)
		{
			System.out.println(e);
		}
		
		try
		{
			BookInventory.issueBooks(b, bi);
		}
		catch(ISBNNotExistsException e)
		{
			System.out.println(e);
		}
		catch(BookIssuedException e)
		{
			System.out.println(e);
		}
	}
}
