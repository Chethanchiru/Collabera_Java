class Parent 
{
	static int a=5;
	int b=10;
	
	public static void demo()
	{
		System.out.println("parent method");
	}
}

class Child extends Parent 
{
	static int a=15;
	int b=20;
	
	public static void demo()
	{
		System.out.println("child method");
	}
}


class Driver2
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		System.out.println(p1.a);//5
		System.out.println(p1.b);//
		p1.demo();
		System.out.println("=============");
	
		Parent p2=new Child();// child class(object) is stored in parent reference and with the help parent reference we cannot access child members
		System.out.println(p2.a);
		System.out.println(p2.b);
		p2.demo();
		System.out.println("=============");
		/*System.out.println(p2.c);
		System.out.println(p2.d);
		p2.demo();*/

		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.demo();
		System.out.println("=============");
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.demo();

		Child c2=(Child) new Parent();//Exception in thread "main" java.lang.ClassCastException: class Parent cannot be cast to class Child (Parent and Child are in unnamed module of loader 'app')
       // at Driver2.main(Driver2.java:52)
		System.out.println(c2.a);
		System.out.println(c2.b);
		c2.demo();
		System.out.println("=============");
		System.out.println(c2.a);
		System.out.println(c2.b);
		c2.demo();

	}
}




	

