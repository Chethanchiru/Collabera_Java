//contains method and containsAll Method
import java.util.*;
class containsAllMethod
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			System.out.println(ls);

		ArrayList ls1=new ArrayList();
			ls1.add(50);
			ls1.add(60);
			ls1.add(70);
			System.out.println(ls1.addAll(ls));

			Object a=20;

			System.out.println("\n what is the index of the element 20?: " +ls1.indexOf(a));
			System.out.println("\n Does is contains the element 20?: " +ls1.contains(a));
			System.out.println("\n Does is contains the element ls?: " +ls1.containsAll(ls));
			System.out.println(ls1);
	}
}
