//Second largest no
class Demo3 
{
	public static void main(String[] args) 
	{
		int a=10, b=20, c=30;
		if ((a>b)&&(a>c))
		{
			if (b>c)
			{
				System.out.println(b+ "b is second largest");
			}
			else
				System.out.println(c+ "c is second largest");
		}
		else if (b>c)
		{
			if (a>c)
			{
				System.out.println(a+ "a is second largest");
			}
			else
				System.out.println(c+ "c is second largest");
		}
		else 
		{
			if (b>a)
			{
				System.out.println(b+ "b is second largest");
			}
			else
				System.out.println(a+ "a is second largest");
	}
}
}