class Non_Static 
{
	int a;
	int b=20;

	static 
	{
	int c=20;
	} 

	public static void demo()
	{
		int d=20;
		System.out.println(a);// Non_Static.java:14: error: non-static variable a cannot be referenced from a static context
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);// Non_Static.java:19: error: non-static variable a cannot be referenced from a static context
		Non_Static s=new Non_Static();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);// Non_Static.java:23: error: cannot find symbol
		System.out.println(s.d);// Non_Static.java:24: error: cannot find symbol
		s.demo();
	}
}
