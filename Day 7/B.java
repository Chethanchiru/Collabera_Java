class A 
{
	int a=10;

	public void display()
	{
		System.out.println("Hello from A.");
	}
}	

class B extends A
{
	int b=20;

	public static void main(String[] args) 
	{
		B c=new B();
		c.display();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
