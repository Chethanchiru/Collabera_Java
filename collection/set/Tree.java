
import java.util.*;
class Tree
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		boolean f=true;
		HashSet hs= new HashSet();

		do
		{
			System.out.println("1 add the value");
			System.out.println("2 to exit");
			int a=s.nextInt();
			switch(a)
			{
				case 1: { System.out.println("enter the integer value");
				hs.add(s.nextInt());
				System.out.println(hs);			
					}
					break;
				case 2: f=false;
			}
		}
		while (f);
		System.out.println(hs);	
		TreeSet t =new TreeSet(hs);
		System.out.println(t);	
	}
}
