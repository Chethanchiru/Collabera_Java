import java.util.Scanner;

class Atm 
{
	private long Account_no=12345680l;
	private double balance=0.0;
	private int password=1243;
	private String Account_holder_name="rama";

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


	public static void main(String[] args) 
	{
		Atm a=new Atm();
		a.addbalance(2000.00);
		System.out.println(a.withdraw(500.00));
	}	
}