class Demo1
{
	final int a;// variable can be initialized in the default constructor
	Demo1()
	{
		a=20;
	}

	final static int b;//Demo1.java:7: error: variable b might not have been initialized

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


