import java.util.Scanner;
class  ConcatString
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname=s.nextLine().trim().toUpperCase();
		System.out.println("Enter the last name");
		String Lastname=s.nextLine().trim().toUpperCase();

		
		System.out.println(firstname.concat("" +Lastname));
	}
}
