class Book2
{
	String title;
	double price;
	String author;	

		{
			System.out.println("Non static-initializers");
		}


	public void display()
{
	System.out.println(title);
	System.out.println(price);
	System.out.println(author);
}

	Book2()
	{
			System.out.println("Non argument Constructor");
		}

	public static void main(String[] args) 
	{
		Book2 b=new Book2();
		b.title="Harry potter";
		b.price=250.5;
		b.author="Ram";
		b.display();
		
	}
}
