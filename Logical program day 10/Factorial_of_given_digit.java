class  Factorial_of_given_digit
{
	public static void main(String[] args) 
	{
		int num=896;
		while (num>0)
		{
			int product=1;
			int temp=num%10;
			for (int i=1;i<=temp;i++ )
			{
				product=product*i;
			}
			System.out.println(product);
			num=num/10;
		}
	}
}
