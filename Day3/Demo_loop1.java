import java.util.Scanner;
class Demo_loop1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=s.nextInt();
		for (int i=1;i<=m;i++ )
		{
			System.out.println(i);
		}
	}
}