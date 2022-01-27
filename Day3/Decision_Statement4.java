import java.util.Scanner;
class Decision_Statement4 
{
	public static void largestnum(int a, int b, int c )
{
	if ((a>=b && a>=c))
		{
			System.out.println(a+ "-is largest");
		}
	else if (b>=c)
	{
		System.out.println(b+ "-is largest");
	}
	else 
	{
		System.out.println(c+ "-is largest");
	}
}		

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		largestnum(a,b,c);
	}
}
