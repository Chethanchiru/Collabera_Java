class Account 
{
	private String account_holder_name;
	private int account_number;
	private double balance;
	private int pwd;
	
	public String getaccount_holder_name()
	{
		return account_holder_name;
	}

	public void setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}

	 public int getaccount_number()
	{
		return account_number;
	}

	public double getbalance()
	{
		if(this.pwd==pwd)
		{
			return balance;
		}
		else 
		{
			System.out.println("Enter valid pwd");
			return 0;
		}
	}

	public void setbalance(double balance)
	{
		if(balance>0)
		{
			this.balance+=balance;
		}
	}

	public void accountDetails()
	{
		System.out.println("Account Holder name:" +account_holder_name);
		System.out.println("Account Account Number:" +account_number);
		System.out.println("Account balance:" +balance);
	}

}
