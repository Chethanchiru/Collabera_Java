import java.util.Scanner;
class  ReverseString
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String s1=s.nextLine().trim();
		String s2="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}	
			System.out.print(s2.trim());	
	}
}
