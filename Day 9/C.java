class P 
{
	public void call()
	{
		System.out.println("Hi");
	}

	public void call(int a, int b)
	{
		System.out.println("I got selected");
	}

	public void call(int a, int b, int c )
	{
		System.out.println("in an interview");
	}
}
	
class C extends P
{
	public static void call(int a, double b)
	{
		System.out.println("salary package");
	}

	public static void call(double a, int b)
	{
		System.out.println("15 LPA");
	}

}


	
