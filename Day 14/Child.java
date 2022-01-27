class Parent 
{
	static int a;
		int b;

	public static void demo()
	{
		System.out.println("demo");
	}

	public void temp()
	{
		System.out.println("temp");
	}
}

class Child extends Parent
{
	int c;
	static int d;
	
	public static void main(String[] args) 
	{
		Child c=new Child();
		Parent p=new Parent();

		if (p instanceof Parent)
		{
			Parent p1=p;
		}

		if (p instanceof Child)
		{
			Child c1=(Child) p;
		}

		if (c instanceof Child)
		{
			Child c2=c;
		}
		
		if (c instanceof Parent)
		{
			Parent p2=c;
		}
	}

}



















