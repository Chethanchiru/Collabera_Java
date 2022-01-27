class Digitalsum 
{
	public static void main(String[] args) 
	{
		int num=4598;
		int sum=0;
		do
		{
			while (num>0)
			{
				int digit=num%10;
					sum+=digit;
					num=num/10;			
			}
			num=sum;
			sum=0;
			}
		while (num>9);
		System.out.println(num);
	}
}
