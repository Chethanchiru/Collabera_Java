import java.util.Scanner;
class Decision_Statement2 
{
	public static void typeofchar(char ch)
{
	if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println(ch+ "-is a Alphabet");
		}
	else if ((ch>='0' && ch<='9'))
	{
		System.out.println(ch+ "-is a digit");
	}
	else 
	{
		System.out.println(ch+ "-is a special character");
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
