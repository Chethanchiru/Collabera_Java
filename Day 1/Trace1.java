class Trace1 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 40;
		Boolean res = a++ > b && b++ < a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(res);
	}
}
