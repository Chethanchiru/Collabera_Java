// summation of even and odd digits
class Driver 
{
	public static void main(String[] args) 
	{
		int num=4598;
		int se=0;
		int so=0;
		while (num>0)
		{
			int temp=num%10;
			if (temp%2==0)
			{
				se=se+temp;
			}
			else
			{
				so=so+temp;
			}
			num=num/10;
		}
		System.out.println(se);
		System.out.println(so);
	}
}
