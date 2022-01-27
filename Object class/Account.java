class Account
{
	private long acc_no;
	private String ifsc;

	public long getacc_no()
	{
		return acc_no;
	}

	public void setacc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}

	public String getifsc()
	{
		return ifsc;
	}

	public void setifsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	
}

class SavingsAccount extends Account
{
	private double balance;

	public double getbalance()
	{
		return balance;
	}

	public void setbalance(double balance)
	{
		this.balance=balance;
	}

	@Override
	public String toString()
	{
		return "\nAccount no:" + getacc_no + "\nAccount ifsc:" + getifsc + "\nAccount balance:" + balance;
	}

	@Override
	public boolean equals(Object o)
	{
		SavingsAccount s1=(SavingsAccount)o;
		if ((this.getacc_no()==s1.getacc_no()) && (this.getifsc()==s1.getifsc()) && (this.balance==s1.balance))
		{
			return true;
		}
		else{ 
			return false;
			}
	}
	
	@Override
	public int hashCode()
	{
		return (int) (getacc_no()+balance);
	}

	public void displayAttributes()
	{
		System.out.println("Account no:" +acc_no);
		System.out.println("Account ifsc:" +ifsc);
		System.out.println("Account no:" +balance);
	}

}

class LoanAccount extends Account
{
	private double LoanAccount;

	public double getLoanAccount()
	{
		return LoanAccount;
	}

	public void setLoanAccount(double balance)
	{
		LoanAccount=balance;
	}

	@Override
	public String toString()
	{
		return "\nAccount no:" + acc_no + "\nAccount ifsc:" + ifsc + "\nLoanAccount no:" + LoanAccount;
	}

	@Override
	public boolean equals(Object o)
	{
		LoanAccount l1=(LoanAccount)o;
		if ((this.getacc_no()==s1.getacc_no()) && (this.getifsc()==s1.getifsc()) && (this.LoanAccount==s1.LoanAccount))
		{
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return (int) (getacc_no()+LoanAccount);
	}
}

class Driver2
{
	public static void main(String [] args)
	{
		SavingAccount s=new SavingAccount();
		SavingAccount s1=new SavingAccount();

		s.setacc_no(3248792);
		s.setifsc("icici.358522");
		s.setbalance(30000);
		System.out.println(s1.toString());
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));


	}
}




