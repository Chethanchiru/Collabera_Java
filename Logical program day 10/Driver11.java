//strong number
class Driver11 
{
	public static void main(String[] args) 
	{
		int num=145;
		int num1=num;
		int sum=0;
		while (num>0)
		{
			int temp=num%10;
			int fact=1;
			for (int i=1;i<=temp;i++ )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (sum==num1)
		{
			System.out.println("Strong number");
		}
		else 
			System.out.println("Not a Strong number");	
	}
}



