abstract class Demo 
{
	public abstract void test();
}

class Driver extends Demo
{
	public static void main(String[] args) 
	{
		System.out.println("hi");
	}

	public void test()
	{
		System.out.println("test");
	}
	
	/*Driver d=new Driver();
		d.test();*/
}