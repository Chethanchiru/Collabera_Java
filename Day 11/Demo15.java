class Demo15 
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
		Demo15.Static();
		Demo15.demo();
		Demo15 d=new Demo15();
			d.Static();
			d.demo();
		System.out.println(Demo15.demo());
		System.out.println(d.demo());
	}
}
