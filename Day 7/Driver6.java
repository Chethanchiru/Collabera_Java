class Branch 
{
	private String manager_name= "Resham";
	private String ifsc = "SBI1000546";
	
	public String getmanager_name()
	{
		return manager_name;
	}
	
	public void setmanager_name(String manager_name)
	{
		this.manager_name = manager_name;
	}

	public String getifsc()
	{
		return ifsc;
	}

	Account a;

	public void createAccount(String account_holder_name, String account_no, double bal)
	{
		a=new Account(account_holder_name, account_no, bal);
		System.out.println("Account has been successfully created");
	}
	
	public void branchAttribute()
	{
		System.out.println("Branch Manager Name:" +manager_name);
		System.out.println("Branch IFSC Code:" +ifsc);
		System.out.println("================================");
	} 
}
	

class Account
{
	private String account_holder_name;
	private String account_no;
	private double bal;

	public String getaccount_holder_name()
	{
		return account_holder_name;
	}
	
	public void setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name = account_holder_name;
	}

	public String getaccount_no()
	{
		return account_no;
	}
	
	public double getbal()
	{
		return bal;
	}
	
	public void setbal(double bal)
	{
		this.bal = bal;
	}
	
	Account()
	{
		
	}

	Account(String account_holder_name, String account_no, double bal)
	{
		this.account_holder_name=account_holder_name;
		this.account_no=account_no;
		this.bal=bal;
	}

	public void accountDeatils( )
	{
		System.out.println("Account Holder Name:" +account_holder_name);
		System.out.println("Account Number:" +account_no);
		System.out.println("Account Balance:" +bal);	
	}
}

class Driver6
{
	public static void main(String[] args) 
	{
		Branch b= new Branch();
		b.createAccount("Chethan", "789221556", 10000000);
		b.branchAttribute();
		b.a.accountDeatils();
	}
}




