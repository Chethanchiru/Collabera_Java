/*public abstract class A
{
	abstract void m1();
	A() {}
	void m2() {}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/

/*public abstract class A
{
	abstract int x=100;
	abstract void m1();
	abstract void m1();
}*/

/*public abstract class A
{
	abstract void m1();
	A() {}
	}

class Test {
	public static void main(String[] args) 
	{
		A a = new A();
	}
}*/

/*public abstract class A
{
	abstract void m1();
	A() {}
	static void m2() {System.out.println("Hello java");}
	}

class B extends A {
		public void m1(){
			A.m2();
		}
		
	}


class Driver5
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
	}
}*/

public abstract class A
{
	abstract void m1();
	void m2() {System.out.println("one");}
	}

 class B extends A {
		void m2() {
	System.out.println("two");
	}
	}


class Test
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m2();
	}
}