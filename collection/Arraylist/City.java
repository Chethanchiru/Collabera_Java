//wajp to store fruits and print the index of it
import java.util.*;
class City
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the city");
		String city=s.nextLine().trim();
		ArrayList ls=new ArrayList();
			ls.add("Bangalore");
			ls.add("Mangalore");
			ls.add("Bombay");
			ls.add("Chennai");
			
			
			if (ls.contains(city))
			{
				System.out.println(ls.remove(ls.indexOf(city)));
				System.out.println(ls);
			}
			else
				System.out.println("city is not available");
				System.out.println(ls.indexOf(city));

	}
}
