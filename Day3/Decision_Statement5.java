import java.util.Scanner;
class Decision_Statement5
{
	public static void leapyear(int a)
{
	if ((a%4==0 && a%100!=0) || a%400==0) 
		{
			System.out.println("leap year");
		}
	else 
	{
		System.out.println("not a leap year");
	}
	
}		

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a year");
		int a=s.nextInt();
		leapyear(a);
	}
}
