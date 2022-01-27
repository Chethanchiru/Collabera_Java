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

class B extends A
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

class C extends A
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


class Driver10
{
	public static void main(String[] args) 
	{
		
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.e);
		b.display();
		b.display1();

		C c=new C();
		System.out.println(c.a);
		System.out.println(c.d);
		c.display();
		c.display2();
	}
}

















