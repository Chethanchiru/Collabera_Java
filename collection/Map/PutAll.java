import java.util.*;

class PutAll 
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

		// if u create a new hashmap and try to add new values in it to same index it will replace the vaules in that key
		HashMap hm1=new HashMap();
		hm1.put(4,"HM");
		hm1.put(5,"IOS");
		hm1.put(6,"Android");
		hm1.put(7,null);
		hm1.putAll(hm);
		System.out.println(hm1);
	}
}
