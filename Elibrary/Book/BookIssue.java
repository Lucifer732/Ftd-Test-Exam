package Elibrary.Book;

public class BookIssue 
{
	String name;
	String author;
	private int isbn;
	int price;
	
	public BookIssue(int ISBN, String Name, String Author, int Price)
	{
		isbn=ISBN;
		name=Name;
		author=Author;
		price = Price;
	}
	public int getISBN()
	{
		return isbn;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
}
