import java.util.Scanner;
class Decision_Statement9
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println("Enter a choice");
		int choice=s.nextInt();
		switch(choice)
		{
			case 4:
			case 1:{
				System.out.println("Study kannada");
				break;	
				}
			case 6:
			case 2:{
				System.out.println("Study English");
				break;	
				}
			case 5:
			case 3:{
				System.out.println("Study Hindi");
				break;	
				}
			case 7:{
				System.out.println("Holiday");
				break;	
				}
			default:
				System.out.println("Select valid option");
			}
	}
}
