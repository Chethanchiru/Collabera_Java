class Book 
{
	String Book_title;
	double Book_price;
	String Book_Author;


	public void displayAttributes( ) 
	{
		System.out.println("Book Title:" +Book_title);
		System.out.println("Book price:" +Book_price);
		System.out.println("Book Author:" +Book_Author);
	}

	Book()
	{
		
	}

	Book(String Book_title, double Book_price, String Book_Author)
	{
		this.Book_title=Book_title;
		this.Book_price=Book_price;
		this.Book_Author=Book_Author;
	}	
}


class Library
{
	int id;
	int slno;
	String L_name;
	
	Book b1;
	
	public void addBook(Book b1)
	{
		this.b1=b1;	
	}

	public void displayAttributes( ) 
	{
		System.out.println("Library id:" +id);
		System.out.println("Library slno:" +slno);
		System.out.println("Library L_name:" +L_name);
	}

	Library()
	{
		
	}

	Library(int id, int slno, String L_name)
	{
		this.id=id;
		this.slno=slno;
		this.L_name=L_name;
	}
}


class Driver1
{
	public static void main(String[] args) 
	{
		Library l1=new Library(145, 10, "Libra");
		l1.displayAttributes( );
		System.out.println();
		l1.addBook(new Book("Life is beautiful", 1000.00, "Virat"));
		l1.b1.displayAttributes( );
	}
}



