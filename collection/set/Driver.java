import java.util.*;
class  Laptop implements Comparable
{
	int id;
	double price;
	String ram;
	
	Laptop (int id, double price, String ram)
	{
		this.id=id;
		this.price=price;
		this.ram=ram;
	}

	public int compareTo(Object o)
	{
		Laptop temp=(Laptop)o;
		if (this.price==temp.price)
			return 0;
		else if (this.price>temp.price)
			return 1;
		else
			return -1;
	}

	public void display()
	{
		System.out.println(id);
		System.out.println(price);
		System.out.println(ram);
		System.out.println("================");
	}

}

class Driver
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		TreeSet t =new TreeSet();
			t.add(new Laptop(123,10000, "4gb"));
			t.add(new Laptop(456,50000, "8gb"));
			t.add(new Laptop(456,50000, "8gb"));
			t.add(new Laptop(789,30000, "2gb"));


		for (Object o : t )
		{
			Laptop e=(Laptop)o;
			e.display();
		}
		
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.println("**********************************");

		Iterator i = t.descendingIterator();

		while (i.hasNext())
		{
			((Laptop)i.next()).display();
		}

	}
}


