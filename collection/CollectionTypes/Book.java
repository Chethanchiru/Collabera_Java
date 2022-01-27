import java.util.*;
class  Book
{
	int id;
	String title;
	double price;

	Book(int id, String title, double price)
	{
		this.id=id;
		this.title=title;
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Book id:" +id);
		System.out.println("Book title:" +title);
		System.out.println("Book price:" +price);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		ArrayList<Book> ls=new ArrayList<>();// do not forget to convert it into book type object ArrayList<Book> ls
		ls.add(new Book(101, "Life", 1000));
		ls.add(new Book(102, "death", 1500));
		ls.add(new Book(101, "Will", 2000));

		for (Book s: ls )
		{
			s.display();
		}
	}
}
	

