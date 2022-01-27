import java.util.*;
public class A13  
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			int sum=0;
			for (Object o: ls)
			{
				int a=(Integer) o;
				sum=sum+a;
			}
			System.out.println(sum);
	}
}
