public abstract class Calculator 
{
	abstract public int add(int a, int b);
}

class Calci extends Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

class Driver2
{
	public static void main(String[]args)
	{
		Calculator c = new Calci();

		System.out.println(c.add(50,10));
	}
}