class A
{
	 void test()
	{
		System.out.println("A");
	}	
} 

class B extends A
{
	protected void test()
	{
		System.out.println("B");
	}	
} 
	
class C extends B
{
	public void test()
	{
		System.out.println("C");
	}	
} 

class Driver6
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.test();
		
		A a1=new B();
		a1.test();
		
		A a2=new C();
		a2.test();

		/*B b=new A(); Driver6.java:38: error: incompatible types: A cannot be converted to B
		b.test();*/
		
		B b1=new B();
		b1.test();
		
		B b2=new C();
		b2.test();

		/*C c=new A(); Driver6.java:47: error: incompatible types: A cannot be converted to C
		c.test();
		
		C c1=new B(); Driver6.java:50: error: incompatible types: B cannot be converted to C
		c1.test();*/
		
		C c2=new C();
		c2.test();
	}
}



