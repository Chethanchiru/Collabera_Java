//addAll Method
import java.util.*;
class AddAllMethod
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
			ls1.addAll(ls);
		System.out.println(ls1);
	}
}
