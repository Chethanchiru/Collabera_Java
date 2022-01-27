class SavingAccount1 
{
	String name;

	SavingAccount1() {}

	SavingAccount1(String name) 
	{
		this.name=name;
	}

	@Override
	public String toString()
	{
		return "name : = " +name;
	}

	public static void main(String[] args) 
	{
		
		SavingAccount1 s2=new SavingAccount1("Edward");
		System.out.println(s2);

	}
}
