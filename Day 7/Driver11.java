class A 
{
	int a=5;
	{
		System.out.println("Non Static intializer");
	}
	public static void display()
	{
		System.out.println("Static method");
	}
}

class B 
{
	 int e=10; 
	static
	{
		System.out.println("Static b intializer");
	}
	
	void display1()
	{
		System.out.println("NON-Static method");
		System.out.println(e);
	}
	
}

class C extends B extends A
{
	int d=10; 
	static
	{
		System.out.println("Static c intializer");
	}
	
	void display2()
	{
		System.out.println(d);
	}
}

class Driver11
{
	public static void main(String[] args) 
	{
		
		C c=new C();
		System.out.println(c.a);
		System.out.println(c.d);
		System.out.println(c.e);
		c.display();
		c.display1();
		c.display2();
	}
}

















