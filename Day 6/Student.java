class Student 
{
	int sid;
	String sname;
	String sclass;
	
Student()
{
	
}
	Student(int sid)
{
	this.sid=sid;
}
	Student(int sid, String sname)
{
	this.sid=sid;
	this.sname=sname;
}		

Student(int sid, String sname, String sclass)
{
	this.sid=sid;
	this.sname=sname;
	this.sclass=sclass;
}		
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student sid:" +sid);
		System.out.println("Student sname:" +sname);
		System.out.println("Student sclass:" +sclass);
		System.out.println("=================================");
	}
}
