class P 
{
	public void call()
	{
		System.out.println("Hi");
	}

	public void call(int a, int b)
	{
		System.out.println("How are you");
	}

	public void call(int a, int b, int c )
	{
		System.out.println("I am doing great");
	}
}
	
class C extends P
{
	public static void call(int a, double b)
	{
		System.out.println("I am very happy");
	}

	public static void call(double a, int b)
	{
		System.out.println("I got a girl friend");
	}

}


class Driver2
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.call();
		c.call(10,15);
		c.call(10,15,20);
		c.call(5,4.0);
		c.call(8.0,8);
	}	
}

	
