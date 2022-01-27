class Driver 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();

		e1.toSetAttribute(100, "ABC", 25000.00);
		e2.toSetAttribute(101, "DEF", 20000.00);
		e3.toSetAttribute(100, "GHI", 15000.00);
		
		e1.toPrintAttribute();
		e2.toPrintAttribute();
		e3.toPrintAttribute();
	}
}