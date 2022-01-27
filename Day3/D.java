import java.util.Scanner;
class D
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum=0;

		while (m<=n)
		{
			sum=sum+m;
			m++;
		}
		System.out.println("Enter a number"+sum);
	}
}
