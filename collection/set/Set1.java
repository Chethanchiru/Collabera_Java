import java.util.*;
class Set1 
{
	public static void main(String[] args) 
	{
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add("c");
		hs.add(20);
		hs.add(30.00);
		System.out.println(hs);
		hs.remove(20);
		System.out.println(hs);

		HashSet hs1= new HashSet();
		hs1.add(50);
		hs1.add("e");
		hs1.add(70);
		hs1.add(50.00);
		System.out.println(hs1);
		System.out.println(hs1.addAll(hs));
		hs1.removeAll(hs);
		System.out.println(hs1);
	}
}
