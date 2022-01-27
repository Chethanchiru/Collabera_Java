class A 
{
	public static void demo()
	{
		System.out.println("A");
	}
}

class B extends A 
{
	public static void demo()
	{
		System.out.println("B");
	}
}

class C extends B  
{
	public static void demo()
	{
		System.out.println("C");
	}
}

class Driver4
{
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.demo();

		A obj1=new B();
		obj1.demo();

		A obj2=new C();
		obj2.demo();

		/*B obj11=new A();//Driver3.java:35: error: incompatible types: A cannot be converted to B
		  obj11.demo()*/

		B obj12=new B();
		obj12.demo();

		B obj13=new C();
		obj13.demo();

		
		/*C obj21=new A(); // Driver3.java:48: error: incompatible types: A cannot be converted to C
			obj21.demo();

		C obj22=new B(); // Driver3.java:52: error: incompatible types: B cannot be converted to C
		  obj22.demo();*/

		C obj23=new C();
		  obj23.demo();

	}
}
	
