class FactorialEven 
{
	public static void main(String[] args) 
	{
		int num=269;
		while (num>0)
		{
			int temp=num%10;
			if(temp%2==0)
			{
			int fact=1;
			for (int i=1;i<=temp;i++)
			{
				fact=fact*i;
			}
			System.out.println(temp+" fact "+fact);
			}
			num=num/10;
		}

	}
}
