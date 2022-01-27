import java.util.Scanner;
class Decision_Statement3
{
	public static void typeofchar(char ch)
{
	if ((ch>='A' && ch<='Z') )
		{
			System.out.println(ch+ "-is a uppercase alphabet");
		}
	else 
	{
		System.out.println(ch+ "-is a lowercase alphabet");
	}
	
}		

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		typeofchar(ch);
	}
}
