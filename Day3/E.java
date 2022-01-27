import java.util.Scanner;
class E
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
			if(m%3==0 && m%5==0)
			{
				System.out.println(m);
			}
			m++;
		}
}
}
