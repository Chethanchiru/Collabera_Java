class A 
{
	public void testA()
	{
		System.out.println("From class A");
	}
}

class B extends A
{
	public void testB()
	{
		System.out.println("From class B");
	}
}

class C extends B
{
	public void testC()
	{
		System.out.println("From class C");
	}
}

class D extends B
{
	public void testD()
	{
		System.out.println("From class D");
	}
}

class Driver14
{
	public static void main(String[] args) 
	{
		A obj11=new A();
		obj11.testA();
		
		B obj12=new B();
		obj12.testA();
		obj12.testB();

		C obj13=new C();
		obj13.testA();
		obj13.testB();
		obj13.testC();

		D obj14=new D();
		obj14.testA();
		obj14.testB();
		obj14.testD();

		A obj1=new D();
		System.out.println(obj1 instanceof C);

		A obj2=new C();
		System.out.println(obj2 instanceof D);

		D obj3=(D)new A();
		System.out.println(obj3 instanceof B);
		
		/*C obj4=(C)new D();
		System.out.println(obj4 instanceof C);*/

		B obj5=new C();
		System.out.println(obj5 instanceof D);

		B obj6=new D();
		System.out.println(obj6 instanceof A);

		B obj7=new D();
		System.out.println(obj7 instanceof B);

		B obj8=(B)new A();
		System.out.println(obj8 instanceof C);
		
		/*D obj9=(D)new C();
		System.out.println(obj9 instanceof A);*/
	}
}
	