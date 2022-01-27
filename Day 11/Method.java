class Method 
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

	public static void main(String[] args) 
	{
		Method m=new Method();
		System.out.println(b);
		System.out.println(a);// Method.java:25: error: non-static variable a cannot be referenced from a static context
		
		demo();// Method.java:27: error: non-static method demo() cannot be referenced from a static context
		demo1();// Method.java:28: error: non-static method demo1() cannot be referenced from a static context
		temp();

		m.demo();
		m.demo1();
		m.temp();
		
	}
}
