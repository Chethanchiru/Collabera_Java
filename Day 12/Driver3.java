class Coupon 
{
	String Class1;
	String Standby;
	String MealCode;
	String Date_of_Redemption;

	public void display()
	{
		System.out.println("Class:" +Class1);
		System.out.println("Standby:" +Standby);
		System.out.println("MealCode:" +MealCode);
		System.out.println("Date_of_Redemption:" +Date_of_Redemption);
	}
}

class Ticket
{
	String Ticket_Code;
	int number;
	
	public void display()
	{
		System.out.println("Ticket Code:" +Ticket_Code);
		System.out.println("Number:" +Number);
	}

	Coupon c1;
	public void addCoupon(Coupon c1)
	{
		this.c1=c1;
	}

	Ticket() {}

	Ticket(String Ticket_Code, int number)
	{
		this.Ticket_Code=Ticket_Code;
		this.number=number;
	}
}


class Customer
{
	String name;
	String date_of_birth;

	public void display()
	{
		System.out.println("Name:" +name);
		System.out.println("Date_of_birth:" +date_of_birth);
	}

	Ticket t1=new Ticket("C0456", 789);

	Customer() {}
	
	Customer(String name, String date_of_birth)
	{
		this.name=name;
		this.date_of_birth=date_of_birth;
	}

}

class Driver3
{
	public static void main(String[] args) 
	{
		Customer d1=new Customer("Chethan", "05/08/1996");
		d1.display();
		System.out.println();
		d1.t1.display();
		System.out.println();
		d1.addCoupon(new Coupon());
		d1.t1.c1.display();
	}	
}

	

