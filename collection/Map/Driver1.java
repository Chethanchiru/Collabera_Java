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

class Driver1
{
	public static void main(String[] args) 
	{
		LinkedHashMap <Book,Author>lhm=new LinkedHashMap<>();
		lhm.put(new Book(1,"Villan","hari"),new Author("Kommaghatta",9,"kengeri"));
		lhm.put(new Book(4,"Demon slayer","chethan"),new Author("heroku",5,"japan"));
		lhm.put(new Book(2,"one piece","chandan"),new Author("banaswadi",8,"k.R puram"));
		System.out.println(lhm);
		System.out.println();
		System.out.println("covert to hashmap");
		HashMap hm=new HashMap(lhm);
		System.out.println(hm);
		System.out.println();
		System.out.println("covert treemap");
		TreeMap tm=new TreeMap(hm);
		System.out.println(tm);
		System.out.println();
		System.out.println("covert HashTable");
		Hashtable ht=new Hashtable(tm);
		System.out.println(ht);
		
	}

}


