import java.util.*;

class Generic
{
	public static void main(String[] args) 
	{
		HashMap <String,String>hm=new HashMap<>();
		hm.put("0","Hello");
		hm.put("1","Hi");
		//hm.put(null,null);
		hm.put("2","Hey");
		hm.put("2","How r u");
		hm.put("3",null);
		System.out.println(hm);

		TreeMap tm=new TreeMap(hm);
		System.out.println(tm);
	}
}
