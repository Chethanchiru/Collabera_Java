import java.util.Scanner;
class Demo_loop4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum=0;
		for (int i=m;i<=n;i++ )
		{
				sum=sum+i;
		}
		System.out.println(sum);
	}
}

