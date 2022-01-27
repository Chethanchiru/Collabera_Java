// to sort the elements in the arraylist
import java.util.*;
class ArrayListSorting1
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add("sheela");
			ls.add("laila");
			ls.add("mala");
			ls.add("dinga");

		System.out.println("before sorting");
		System.out.println(ls);

		System.out.println();
		Collections.sort(ls);// collection is an interface and collections is an class
		System.out.println("after sorting in ascending");
		System.out.println(ls);

		System.out.println();
		Collections.reverse(ls);
		System.out.println("after sorting in descending");
		System.out.println(ls);


	}
}
