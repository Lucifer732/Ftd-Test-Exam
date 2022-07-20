package Elibrary.Inventory;

import java.util.*;

import Elibrary.Customexceptions.*;
import Elibrary.Book.*;

public class BookInventory 
{
	public static void addBooks(List<Book> b, int n) throws ISBNExistsException
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int ISBN;
		String name;
		String author;
		int price;
		for(int i=0;i<n;i++)
		{
			System.out.println("Please Enter the ISBN of the Book:");
			ISBN=sc.nextInt();
			for(Book j:b)
			{
				if(j.getISBN()==ISBN)
				{
					throw new ISBNExistsException("ISBN Is Already Present");
				}
			}
			System.out.println("Enter Name of the Book:");
			name=sc.next();
			System.out.println("Enter Author Name:");
			author=sc.next();
			System.out.println("Enter Price of the book:");
			price=sc.nextInt();
			b.add(new Book(ISBN,name,author,price));
		}
	}
	public static void issueBooks(List<Book> bl, List<BookIssue> bi) throws ISBNNotExistsException, BookIssuedException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ISBN,flag=0;
		System.out.println("Enter ISBN of book to be issued:");
		ISBN=sc.nextInt();
		for(Book b:bl)
		{
			if(b.getISBN()==ISBN)
			{
				flag=1;
				bl.remove(b);
				bi.add(new BookIssue(b.getISBN(),b.getName(),b.getAuthor(),b.getPrice()));
				break;
			}
		}
		if(flag==0)
		{
			throw new ISBNNotExistsException("ISBN Does Not Exists");
		}
		@SuppressWarnings("unused")
		int issued=0;
		for(BookIssue b:bi)
		{
			if(b.getISBN()==ISBN)
			{
				issued=1;
				bi.add(new BookIssue(b.getISBN(),b.getName(),b.getAuthor(),b.getPrice()));
				break;
			}
		}
		if(flag==0)
		{
			throw new BookIssuedException("ISBN is already Issued");
		}
		for(Book b:bl)
		{
			System.out.println(b.getISBN()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPrice());
		}
	}
}
