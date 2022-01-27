class A 
{
	static void demo()
	{
		System.out.println("A");
	}
}

class B extends A 
{
	 protected static void demo1()
	{
		System.out.println("B");
	}
}

class C extends B  
{
	public static void demo2()
	{
		System.out.println("C");
	}
}

class Driver7
{
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.demo();

		A obj1=new B();
		obj1.demo();
		//obj1.demo1();// cannot find symbol

		A obj2=new C();
		obj2.demo();
		/*obj2.demo1();
		obj2.demo2();*/// cannot find symbol

		/*B obj11=new A();//Driver3.java:35: error: incompatible types: A cannot be converted to B
		  obj11.demo()*/

		B obj12=new B();
		obj12.demo();
		obj12.demo1();

		B obj13=new C();
		obj13.demo();
		obj13.demo1();
		//obj13.demo2(); cannot find symbol

		
		/*C obj21=new A(); // Driver3.java:48: error: incompatible types: A cannot be converted to C
			obj21.demo();

		C obj22=new B(); // Driver3.java:52: error: incompatible types: B cannot be converted to C
		  obj22.demo1();*/

		C obj23=new C();
		  obj23.demo();
		  obj23.demo1();
		  obj23.demo2();

	}
}
	
