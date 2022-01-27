class A 
{
	int a;

	public void display()
	{
		System.out.println("Hello from A.");
	}
}	

class B1 extends A
{
	int b;

	public static void main(String[] args) 
	{
		B1 c=new B1();
		c.a=20;
		c.b=15;
		c.display();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
