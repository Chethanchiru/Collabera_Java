final class Test
{
	public static void demo()
	{
		System.out.println("from final test");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


class Driver extends Test //Driver.java:14: error: cannot inherit from final Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test.demo();
	}

}