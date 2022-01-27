import java.util.Scanner;
class Decision_Statement8
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("1. Idle Vada");
		System.out.println("2. Masala Dosa");
		System.out.println("3. Pulav");
		System.out.println("4. Green peace ricebath");
		System.out.println("Enter a choice");
		int choice=s.nextInt();
		switch(choice)
		{
			case 1:{
				System.out.println("Idle Vada is ready");
				break;	
				}
			case 2:{
				System.out.println("Masala Dosa is ready");
				break;	
				}
			case 3:{
				System.out.println("Pulav is ready");
				break;	
				}
			case 4:{
				System.out.println("Green peace ricebath is ready");
				break;	
				}
			default:
				System.out.println("Select valid option");
			}
	}
}
