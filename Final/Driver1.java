 class Test1
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


final class Driver1 extends Test1 //final class can inherit from Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test1.demo();
	}

}