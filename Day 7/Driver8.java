class A 
{
	int a=5;
	{
		System.out.println("Non Static initilizer");
	}
}

class B extends A
{
	 int c=10; 
	static
	{
		System.out.println("Static initilizer");
	}
}


class Driver8
{
	public static void main(String[] args) 
	{
		B b=new B();
		System.out.println(b.c);
		System.out.println(b.a);
	}
}

















