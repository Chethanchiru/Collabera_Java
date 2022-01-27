class A 
{
	int a=5;
	int b=10;
}

class B extends A 
{
	int a=20;
	int b=35;
}

class C extends B  
{
	int a=55;
	int b=27;
}

class Driver3
{
	public static void main(String[] args) 
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.b);

		A obj1=new B();
		System.out.println(obj1.a);
		System.out.println(obj1.b);

		A obj2=new C();
		System.out.println(obj2.a);
		System.out.println(obj2.b);

		/*B obj11=new A();//Driver3.java:35: error: incompatible types: A cannot be converted to B
		System.out.println(obj11.a);
		System.out.println(obj11.b);*/

		B obj12=new B();
		System.out.println(obj12.a);
		System.out.println(obj12.b);

		B obj13=new C();
		System.out.println(obj13.a);
		System.out.println(obj13.b);

		
		/*C obj21=new A(); // Driver3.java:48: error: incompatible types: A cannot be converted to C
		System.out.println(obj21.a);
		System.out.println(obj.b);

		C obj22=new B(); // Driver3.java:52: error: incompatible types: B cannot be converted to C
		System.out.println(obj22.a);
		System.out.println(obj22.b);*/

		C obj23=new C();
		System.out.println(obj23.a);
		System.out.println(obj23.b);

	}
}
	
