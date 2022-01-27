import java.util.Scanner;

class Atm1 
{
	private long Account_no=12345680l;
	private double balance=0.0;
	private int password=1243;
	private String Account_holder_name="rama";

	public long getAccountNo()
	{
		return Account_no;
	}
	
	public void addbalance(double balance)
	{
		if ((balance%100==0) || (balance%500==0) || (balance%2000==0))
		{
			this.balance=this.balance+balance;
		}
		else 
		{
			System.out.println("Enter amount which accepts 100 or 500 or 2000");
		}
	}

		public double withdraw(double amount)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the password");
		int password=s.nextInt();
		if (this.password==password)
		{
			if (amount<balance)
			{
				balance=balance-amount;
				System.out.println("Successfully withdraw amount");
			}
			else
				{
					System.out.println("insufficient balance");
				}
		}
			else 
				{
					System.out.println("Incorect password enter valid password");
				}
		return balance;
		}

	public void setAccount_holder_name(String name)
	{
		Account_holder_name=name;
	}

	public static void main(String[] args) 
	{
		Atm1 a=new Atm1();
		boolean flag=true;
		do
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("********************************");
			System.out.println("1. Add Balance");
			System.out.println("2. withdraw");
			System.out.println("3. Account_no");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			System.out.println("********************************");
			int choice=s1.nextInt();
			switch (choice)
			{
			case 1:{
						System.out.println("Enter the amount");
						int b=s1.nextInt();
						a.addbalance(b);
						System.out.println(" Balance of " + b + " is successfully added to your account ");	
					}
					break;
			case 2:{
						System.out.println("Enter the amount to withdraw");
						int c=s1.nextInt();
						a.withdraw(c);
						System.out.println(" Amount of " + c + " is successfully withdrawn from your account ");
					}
					break;
			case 3:{
						System.out.println(a.getAccountNo());
					}
					break;
			case 4: flag=false;
			
			}
		}
		while (flag);

	}	
}