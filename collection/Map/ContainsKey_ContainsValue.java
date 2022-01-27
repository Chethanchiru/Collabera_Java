import java.util.*;

class ContainsKey_ContainsValue
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
		System.out.println(hm);// {0=Hello, null=null, 1=Hi, 2=How r u, 3=null}
		System.out.println(hm.containsKey(1));// true
		System.out.println(hm.containsValue("hey"));// false
		System.out.println(hm.containsValue("Hi"));// true
	}
}
