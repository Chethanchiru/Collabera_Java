import java.util.Scanner;
class Decision_Statement1 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int num=5;
		if (a%num==0)
		{
			System.out.println("Lucky");
		}
	}
}
