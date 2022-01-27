//RetainAll Method
import java.util.*;
class RetainAllMethod
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			System.out.println(ls);
			System.out.println();

		ArrayList ls1=new ArrayList();
			ls1.add(50);
			ls1.add(60);
			ls1.add(70);
			ls1.addAll(ls);
			System.out.println("before Retain the elements");
			System.out.println(ls1);
			System.out.println();
			System.out.println("After Retain the elements");
			System.out.println(ls1.retainAll(ls));
			System.out.println();
			System.out.println(ls1);
	}
}
