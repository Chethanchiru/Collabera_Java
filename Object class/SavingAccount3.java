class SavingAccount3 
{
	double balance;

	SavingAccount3() {}

	SavingAccount3(double balance) 
	{
		this.balance=balance;
	}
	
	@Override
	public String toString()
	{
		return "balance: = " +balance;
	}

	public static void main(String[] args) 
	{
		SavingAccount3 s3=new SavingAccount3(500000);
		System.out.println(s3);

	}
}
