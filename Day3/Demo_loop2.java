import java.util.Scanner;
class Demo_loop2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		System.out.println("Enter a number");
		int n=s.nextInt();
		while (m<=n)
		{
			if (m%2!=0)
			{
				System.out.println(m);		
			}
			m++;	
		}
	}
}

