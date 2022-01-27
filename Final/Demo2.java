class Demo2
{
	final int a;// variable can be initialized in the non static multiline intializer
	{
		a=20;
	}

	final static int b;//  variable can be initialized in the static multiline intializer
	static
	{
		b=15;
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


