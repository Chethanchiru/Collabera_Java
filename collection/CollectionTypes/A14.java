import java.util.*;
public class A14  
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<Integer>();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			int sum=0;
			for (Integer o: ls)
			{
				sum=sum+o;
			}
			System.out.println(sum);
	}
}
