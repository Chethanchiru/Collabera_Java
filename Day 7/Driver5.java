class Bag 
{
	String color;
	double price;

	Book b;
	

	public void storeBook(String bookTitle, double price)
	{
		b=new Book(bookTitle, price);
		System.out.println("Book is stored inside a bag");
	}

	public void removeBook()
	{
		b=null;
		System.out.println("Book is removed from the bag");
	} 


}


class Book
{
	String bookTitle;
	double price;
	
	Book(String bookTitle, double price)
	{
		this.bookTitle=bookTitle;
		this.price=price;
	}

	public void getBookDetails()
	{
		System.out.println(bookTitle);
		System.out.println(price);
	}
}

class Driver5
{
	public static void main(String[] args) 
	{
		Bag c=new Bag();
		c.storeBook("Live a life like a monk", 1000);
		c.b.getBookDetails();
		c.b.removeBook();
	}
}
	

