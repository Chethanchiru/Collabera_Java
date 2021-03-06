import java.util.*;

class Book implements Comparable 
{
	int bid;
	String title;
	String Author;
	
	Book(int bid,String title,String Author)
	{
		super();
		this.bid=bid;
		this.title=title;
		this.Author=Author;
	}

	@Override
	public int compareTo(Object o){
		Book book=(Book)o;
		return (int)(this.bid-book.bid);
		}
		
		public String toString()
		{
			return ", Book [bid=" + bid + ", Title=" + title + ", Author =" + Author+ "]";
		}
}

class Author
{
	String name;
	int houseno;
	String address;
	
	Author(String name,int houseno,String address)
	{
		this.name=name;
		this.houseno=houseno;
		this.address=address;
	}
		
		public String toString()
		{
			return " \nAuthor [name=" + name + ", houseno=" + houseno + ", Address= " + address+ "]";
		}
}

class Driver
{
	public static void main(String[] args) 
	{
		TreeMap <Book,Author>tm=new TreeMap<>();
		tm.put(new Book(1,"Villan","hari"),new Author("Kommaghatta",9,"kengeri"));
		tm.put(new Book(4,"Demon slayer","chethan"),new Author("heroku",5,"japan"));
		tm.put(new Book(2,"one piece","chandan"),new Author("banaswadi",8,"k.R puram"));
		System.out.println(tm);
	
	}

}


