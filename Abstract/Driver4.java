// done by prassana
import java.util.Scanner;

abstract class Ola 
{
	String customerName;
	long contactNo;

	abstract public void bookRide();

	Scanner s = new Scanner(System.in);
}

class Auto extends Ola
{
	String source;
	String destination;
	String time;
	double distance;

	double cost = 15;
	
	public void bookRide()
	{
		System.out.print("Enter the source location: ");
		source = s.nextLine();
		System.out.print("Enter the destination location: ");
		destination = s.nextLine();
		System.out.print("Enter the departure time: ");
		time = s.nextLine();
		System.out.print("Enter the distance in kilometers: ");
		distance = s.nextDouble();
		System.out.println();

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The auto ride has been booked successfully and will arrive at "+time+"!!");
		double amount = (cost*distance);
		amount += (amount/10);
		System.out.println("Your ride from "+source+" to "+destination+" will cost Rs."+amount);

		System.out.println();
		System.out.println("The cost breakdown is:");
		System.out.println("Rs."+cost+" per km (Rs."+(cost*distance)+") 5% SGST of Rs."+amount/5+" + 5% CGST of Rs."+amount/5);
		System.out.println("--------------------------------------------------------------------------");
	}
}

class Mini extends Ola
{
	String source;
	String destination;
	String time;
	double distance;

	double cost = 18;
	
	public void bookRide()
	{
		System.out.print("Enter the source location: ");
		source = s.nextLine();
		System.out.print("Enter the destination location: ");
		destination = s.nextLine();
		System.out.print("Enter the departure time: ");
		time = s.nextLine();
		System.out.print("Enter the distance in kilometers: ");
		distance = s.nextDouble();
		System.out.println();

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The mini ride has been booked successfully and will arrive at "+time+"!!");
		double amount = (cost*distance);
		amount += (amount/10);
		System.out.println("Your ride from "+source+" to "+destination+" will cost Rs."+amount);
		System.out.println();
		System.out.println("The cost breakdown is:");
		System.out.println("Rs."+cost+" per km (Rs."+(cost*distance)+") 5% SGST of Rs."+amount/5+" + 5% CGST of Rs."+amount/5);
		System.out.println("--------------------------------------------------------------------------");
	}
}

class Prime extends Ola
{
	String source;
	String destination;
	String time;
	double distance;

	double cost = 20;
	
	public void bookRide()
	{
		System.out.print("Enter the source location: ");
		source = s.nextLine();
		System.out.print("Enter the destination location: ");
		destination = s.nextLine();
		System.out.print("Enter the departure time: ");
		time = s.nextLine();
		System.out.print("Enter the distance in kilometers: ");
		distance = s.nextDouble();
		System.out.println();

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("The ride has been booked successfully and will arrive at "+time+"!!");
		double amount = (cost*distance);
		amount += (amount/10);
		System.out.println("Your ride from "+source+" to "+destination+" will cost Rs."+amount);
		System.out.println();
		System.out.println("The cost breakdown is:");
		System.out.println("Rs."+cost+" per km (Rs."+(cost*distance)+") 5% SGST of Rs."+amount/5+" + 5% CGST of Rs."+amount/5);
		System.out.println("--------------------------------------------------------------------------");
	}
}
class Driver4
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);

		Ola ola;
		
		System.out.println(); 
		System.out.println("------------------------------------- Welcome to Ola -------------------------------------");

		while (true)
		{
			System.out.println();
			System.out.println("1. Auto");
			System.out.println("2. Mini");
			System.out.println("3. Prime");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = s.nextInt();
			System.out.println("--------------------------------------------------------------------------");
			
			if (choice == 4)
			{
				break;
			}

			switch (choice)
			{
			case 1:	ola = new Auto();
					System.out.print("Enter your name: ");
					ola.customerName = s.nextLine();
					ola.customerName = s.nextLine();
					System.out.print("Enter your Contact Number: ");
					ola.contactNo = s.nextLong();
					ola.bookRide();
					break;
			case 2: ola = new Mini();
					System.out.print("Enter your name: ");
					ola.customerName = s.nextLine();
					ola.customerName = s.nextLine();
					System.out.print("Enter your Contact Number: ");
					ola.contactNo = s.nextLong();
					ola.bookRide();
					break;
			case 3: ola = new Prime();
					System.out.print("Enter your name: ");
					ola.customerName = s.nextLine();
					ola.customerName = s.nextLine();
					System.out.print("Enter your Contact Number: ");
					ola.contactNo = s.nextLong();
					ola.bookRide();
					break;
			default:System.out.println("Invalid choice");
			}
		}
		System.out.println();
		System.out.println("------------------------------------- Thank You for booking a ride with us -------------------------------------");
	}
}