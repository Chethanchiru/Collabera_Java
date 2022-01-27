class Method1 
{
	int a=20;
	static int b=40;

	public void demo()
	{
		System.out.println("demo()");
	}

	public void demo1()
	{
		System.out.println("demo1()");
	}

	public static void temp()
	{
		System.out.println("temp()");
	}
}
	
class Driver
{
	public static void main(String[] args) 
	{
		Method1 m=new Method1();
		System.out.println(b);//Driver.java:27: error: cannot find symbol
		System.out.println(a);//Driver.java:28: error: cannot find symbol
		
		demo();//Driver.java:31: error: cannot find symbol
		demo1();//Driver.java:32: error: cannot find symbol
		temp();

		m.demo();
		m.demo1();
		m.temp();
}

}	
		
	