class SavingAccount 
{
	String account_no;

	SavingAccount() {}

	SavingAccount(String account_no) 
	{
		this.account_no=account_no;
	}
	
	@Override
	public String toString()
	{
		return "account_no: = " +account_no;
	}

	public static void main(String[] args) 
	{
		SavingAccount s1=new SavingAccount("1548569");
		System.out.println(s1);

	}
}
