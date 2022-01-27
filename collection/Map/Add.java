import java.util.*;

class Add 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(0,"Hello");
		hm.put(1,"Hi");
		hm.put(null,null);
		hm.put(2,"Hey");
		hm.put(2,"How r u");
		hm.put(3,null);
		System.out.println(hm);

		// only keys and return type is keyset
		Set s=hm.keySet();
		System.out.println(s);

		// only values and return type is collection
		Collection c=hm.values();
		System.out.println(c);
	}
}
