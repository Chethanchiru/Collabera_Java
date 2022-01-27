class Employee2
{
	private int Id_number;
	private String emp_name;
	private double emp_salary;

	public int getId_number()
	{
		return Id_number;
	}

	public void setId_number(int Id_number)
	{
		this.Id_number=Id_number;
	}

	public String getemp_name()
	{
		return emp_name;
	}

	public void setemp_name(String emp_name)
	{
		this.emp_name=emp_name;
	}
	
	public double getemp_salary()
	{
		return emp_salary;
	}

	public void setemp_salary(double emp_salary)
	{
		this.emp_salary=emp_salary;
	}

	
	Employee2(int Id_number, String emp_name, double emp_salary)
	{
		this.Id_number=Id_number;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}

	public void displayAttributes()
	{
		System.out.println("Employee Id:" + Id_number);
		System.out.println("Employee name:" + emp_name);
		System.out.println("Employee Salary:" + emp_salary);

	}
	
	@Override
	public String toString()
	{
		return "\nEmployee Id:" + Id_number + "\nEmployee name:" + emp_name + "\nEmployee Salary:" + emp_salary;
	}

	@Override
	public boolean equals(Object o)
	{
		Employee2 e=(Employee2)o;
		if ((this.Id_number==e.Id_number) && (this.emp_name==e.emp_name) && (this.emp_salary==e.emp_salary))
		{
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public int hashCode()
	{
		int hc1=Id_number;
		//String hc2=emp_name;
		double hc3=emp_salary;
		int hc=hc1+(int)hc3;
		return hc;
	}

	public static void main(String[] args) 
	{
		Employee2 e1=new Employee2(101, "hera", 25000);
		Employee2 e2=new Employee2(101, "hera", 25000);
		Employee2 e3=new Employee2(151, "mera", 35000);
		
		System.out.println(e1.Id_number);
		System.out.println(e1.emp_name);
		System.out.println(e1.emp_salary);
		System.out.println();
		System.out.println(e1.toString());
		System.out.println();
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode()==e3.hashCode());
		System.out.println(e2.hashCode()==e3.hashCode());
		System.out.println();
		System.out.println(e2.hashCode());
		System.out.println();
		e1.displayAttributes();
		System.out.println();
		e2.displayAttributes();
		System.out.println();
		e3.displayAttributes();	
	}
}
