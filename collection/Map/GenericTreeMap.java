import java.util.*;

class GenericTreeMap
{
	public static void main(String[] args) 
	{
		TreeMap <String,String>tm=new TreeMap<>();
		tm.put("0","Hello");
		tm.put("1","Hi");
		tm.put("3",null);
		tm.put("2","Hey");
		tm.put("2","How r u");
		//hm.put("3",null);
		System.out.println(tm);
	}
}
