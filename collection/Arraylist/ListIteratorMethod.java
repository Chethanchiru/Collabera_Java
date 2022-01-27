//ListIterator Method
import java.util.*;
class ListIteratorMethod
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			System.out.println(ls);

		ListIterator i=ls.listIterator();

		while (i.hasNext())
		{
			System.out.println((i.next())+"");
			i.remove();
		}

			System.out.println();

		while (i.hasPrevious())
		{
			System.out.println(i.previous()+"");
		}

		System.out.println(ls);
	}
}