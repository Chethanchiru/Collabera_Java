import java.util.Scanner;
class F
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int i=m;m<=n;m++)
			{
				if(m%3==0 && m%5==0)
				{
					System.out.println(m);
				}
			}
	}
}