class Demo16 
{
	static int a=40;
	static int d;

	static
	{
		System.out.println(a);
		System.out.println("first static block");
		System.out.println(d);
	}

	static int b=demo();

	static
	{
		System.out.println(a);
		System.out.println(Demo16.b);
		System.out.println(d);
		d=140;
	}


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}


	public static int demo() 
	{
		d=20;
		return 40;
	}

}
