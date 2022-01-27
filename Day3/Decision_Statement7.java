import java.util.Scanner;
class Decision_Statement7
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter a choice");
		int choice=s.nextInt();
		System.out.println("Enter two integer number");
		int a=s.nextInt();
		int b=s.nextInt();
		switch(choice)
		{
			case 1:{
				System.out.println("addition of two number is:" +(a+b));
				break;	
				}
			case 2:{
				System.out.println("subtraction of two number is:" +(a-b));
				break;	
				}
			case 3:{
				System.out.println("multiplication of two number is:" +(a*b));
				break;	
				}
			case 4:{
				System.out.println("division of two number is:" +(a/b));
				break;	
				}
			default:
				System.out.println("Select valid option");
			}
	}
}
