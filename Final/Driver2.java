 class FinalMethod
{
	final public static void demo()// final method can be inherited 
	{
		System.out.println("from final test");
	}

	public static void demo1()
	{
		System.out.println("override");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


final class Driver2 extends Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test1.demo();
		Driver2 d=new Driver2();
		
	}

}