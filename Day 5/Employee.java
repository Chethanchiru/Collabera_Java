class Employee 
{
	int eid;
	String name;
	double salary; 

	public void toSetAttribute(int eid, String name, double salary)
{	
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}

	public void toPrintAttribute()
{
	System.out.println(eid);
	System.out.println(name);
	System.out.println(salary);
	System.out.println(this);
}
}

	