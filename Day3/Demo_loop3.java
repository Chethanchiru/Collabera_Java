import java.util.Scanner;
class Demo_loop3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		System.out.println("Enter a number");
		int n=s.nextInt();
		int count=0;
		for (int i=m+1;i<n;i++ )
		{
				count++;
				System.out.println("count:" +count);
		}
	}
}

