interface B
{
	public void demo();
}

class A
{
	public void demo()
	{
		System.out.println("demo()");
	}
}

class C extends A implements B 
{
	public static void main(String[] args) 
	{
		B obj=new C();
		obj.demo();

		A obj1=new C();
		obj1.demo();

		B obj2=(B)new A();
		obj2.demo();

	}
}
