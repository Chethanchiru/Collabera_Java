class Student1 
{
	int sid;
	String sname;
	String age;
	double percentage;

	public void display_Attributes()
	{
		System.out.println("Student Details");
		System.out.println("Student sid:" +sid);
		System.out.println("Student sname:" +sname);
		System.out.println("Student age:" +age);
		System.out.println("Student percentage:" +percentage);
		System.out.println("=================================");
	}
	
	 public void edit_name(String sname)
	{
		this.sname=sname;
	}

	Student1()
	{
	
	}

	Student1(int sid)
	{
	this.sid=sid;
	}

	Student1(int sid, String sname)
	{
	this(sid);
	this.sname=sname;
	}		

	Student1(int sid, String sname, String age)
	{
	this(sid, sname);
	this.age=age;
	}		
}
