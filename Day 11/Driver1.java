class Driver1 
{
	int a;
	static String name;

	static
	{
		System.out.println("static");
	}

	int c=40;
	{
		c=c*a;
		System.out.println(c);
	}

	static
	{
		Driver1 d=new Driver1();
		d.a=20;
		d.name="rama";
	}
	
	{
		System.out.println(a);
		System.out.println(name);
		c=test();
	}

	

	public static int test()
	{
		System.out.println("test()");
		return 40;
	}

	{
		a=c+50;
		c=a+10;
		System.out.println(a);
		System.out.println(c);
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		Driver1 d=new Driver1();
		System.out.println(d.a);

		Driver1 d1=new Driver1();
		System.out.println(d1.c);
		System.out.println(test());

	}
}
