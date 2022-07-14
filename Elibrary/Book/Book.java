package Elibrary.Book;

public class Book 
{
	private String name;
	private String author;
	private int isbn;
	private int price;
	
	public Book(int ISBN, String Name, String Author, int Price)
	{
		setISBN(ISBN);
		setName(Name);
		setAuthor(Author);
		setPrice(Price);
	}
	public int getISBN()
	{
		return isbn;
	}
	public void setISBN(int Isbn)
	{
		isbn=Isbn;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String Author)
	{
		author=Author;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int Price)
	{
		price=Price;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		name=Name;
	}
}
