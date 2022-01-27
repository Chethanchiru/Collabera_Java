//wajp to retain the common book
import java.util.*;
class Book1
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add("maths");
			ls.add("geography");
			ls.add("english");
		
		ArrayList ls1=new ArrayList();
			ls1.add("maths");
			ls1.add("geography");
			ls1.add("hindi");
			System.out.println(ls.retainAll(ls1));
			System.out.println("sheela has common book: " +ls);
			
	}
}
