// perfect number
class Driver9 
{
	public static void main(String[] args) 
	{
		int num=6;
		int sum=0;
		
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}

		if (sum==num)
		{
			System.out.println("perfect number");	
		}
		else 
			System.out.println("Not a perfect number");
	}
}