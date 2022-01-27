class A1
{
	public static void main(String[] args) 
	{
		System.out.println("Main() of A");
	}
	static 
	{
		System.out.println("From static of A");
	}
}
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Main() of B");
	}
	static 
	{
		System.out.println("From static of B");
	}
	static int b=40;
}