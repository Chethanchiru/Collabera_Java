//wajp to store fruits and print the index of it
import java.util.*;
class Fruit
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the fruits");
		String fruit=s.nextLine().trim();
		ArrayList ls=new ArrayList();
			ls.add("Apple");
			ls.add("Mango");
			ls.add("Orange");
			ls.add("Grapes");
			
			
			if (ls.contains(fruit))
			{
				System.out.println("fruit is avilable");
			}
			else
				System.out.println("fruit is not avilable");

	}
}
