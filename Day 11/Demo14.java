class Demo14 
{
	public static void Static()
	{
		System.out.println("static");
	}

	static void demo()
	{
		System.out.println("static demo");
	}

	public static void main(String[] args) 
	{
		Static();
		demo();
		Demo14.Static();
		Demo14.demo();
		Demo14 d=new Demo14();
			d.Static();
			d.demo();
	}
}
