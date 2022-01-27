import java.util.Scanner;
abstract class Ola 
{
	String Customer_name;
	long Contact_no;

	public abstract void bookride();
}

class Auto extends Ola
{
	public void bookride()
	{
		System.out.println("Your ride in auto has been successfully booked");
	}	

}

class Mini extends Ola
{
	public void bookride()
	{
		System.out.println("Your ride in mini has been successfully booked");
	}
}

class Prime extends Ola
{
	public void bookride()
	{
		System.out.println("Your ride in Prime has been successfully booked");
	}
}


class Driver3
{
	public static void main(String[]args)
	{	
		Scanner s=new Scanner(System.in);
		Ola ola;
		boolean flag = true;
		do
		{
			System.out.println("*****************************");
			System.out.println("1 -- Auto");
			System.out.println("2 -- Mini");
			System.out.println("3 -- Prime");
			System.out.println("4 -- Exit");
			System.out.println("please enter your choice");
			System.out.println("*****************************");
			int choice = s.nextInt();
			switch(choice)
				{
					case 1:{ola = new Auto();
							Scanner s1=new Scanner(System.in);
							System.out.println("Enter the your name");
							ola.Customer_name=s1.nextLine();
							System.out.println("Enter the your mobile no");
							ola.Contact_no=s1.nextLong();
							System.out.println("Enter the pickup location");
							String pickup=s1.nextLine();
							System.out.println("Enter the destination location");
							String destination=s1.nextLine();
							System.out.println("Enter the time");
							String time=s1.nextLine();
							System.out.println("Enter the distance ");
							double distance=s1.nextDouble();
							double fair=15.00;
							double TotalPrice=distance*fair;
							double SGST=TotalPrice*0.05;
							double CGST=TotalPrice*0.05;
							ola.bookride(); 
							System.out.println("Total price for the ride is : = " + TotalPrice + " && SGST is TotalPrice*0.05 : = " + SGST + " && CGST is TotalPrice*0.05 : = " + CGST);
							
							}
							break;
					
					case 2:{ola = new Mini();
							Scanner s1=new Scanner(System.in);
							System.out.println("Enter the your name");
							ola.Customer_name=s1.nextLine();
							System.out.println("Enter the your mobile no");
							ola.Contact_no=s1.nextLong();
							System.out.println("Enter the pickup location");
							String pickup=s1.nextLine();
							System.out.println("Enter the destination location");
							String destination=s1.nextLine();
							System.out.println("Enter the time");
							String time=s1.nextLine();
							System.out.println("Enter the distance ");
							double distance=s1.nextDouble();
							double fair=18.00;
							double TotalPrice=distance*fair;
							double SGST=TotalPrice*0.05;
							double CGST=TotalPrice*0.05;
							ola.bookride(); 
							System.out.println("Total price for the ride is : = " + TotalPrice + " && SGST is TotalPrice*0.05 : = " + SGST + " && CGST is TotalPrice*0.05 : = " + CGST);
							}
							break;

					case 3:{ola = new Prime();
							Scanner s1=new Scanner(System.in);
							System.out.println("Enter the your name");
							ola.Customer_name=s1.nextLine();
							System.out.println("Enter the your mobile no");
							ola.Contact_no=s1.nextLong();
							System.out.println("Enter the pickup location");
							String pickup=s1.nextLine();
							System.out.println("Enter the destination location");
							String destination=s1.nextLine();
							System.out.println("Enter the time");
							String time=s1.nextLine();
							System.out.println("Enter the distance ");
							double distance=s1.nextDouble();
							double fair=20.00;
							double TotalPrice=distance*fair;
							double SGST=TotalPrice*0.05;
							double CGST=TotalPrice*0.05;
							ola.bookride(); 
							System.out.println("Total price for the ride is : = " + TotalPrice + " && SGST is TotalPrice*0.05 : = " + SGST + " && CGST is TotalPrice*0.05 : = " + CGST);
							}
							break;

					case 4:{
							flag=false;
					}
				}
			}
		while(flag);
	}
}