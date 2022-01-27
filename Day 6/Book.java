class Book 
{
	private int bookid;
	private String title;
	private double price;
	
	public int getbookid()
	{
		return bookid;
	}

	 public String gettitle()
	{
		return title;
	}

	public void settitle(String title)
	{
		this.title=title;
	}

	 public double getprice()
	{
		return price;
	}

	public void setprice(double price)
	{
		this.price=price;
	}

	Book()
	{
		
	}

	Book(int bookid )
	{
		this.bookid=bookid;
	}

	Book(int bookid, String title )
	{
		this(bookid);
		this.title=title;
	}

	Book(int bookid, String title, double price )
	{
		this(bookid, title);
		this.price=price;
	}


	public static void main(String[] args) 
	{	
		Book b=new Book(156, "One Piece", 500);
		System.out.println(b.getbookid());
		b.settitle("Demon Slayer");
		System.out.println(b.gettitle());
		b.setprice(600);
		System.out.println(b.getprice());
	}
}
