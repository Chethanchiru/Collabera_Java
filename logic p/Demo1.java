//Neon number
class Demo1 
{
	public static void main(String[] args) 
	{
		int num=9;
		int sum=0;
		int square=num*num;
		while (square>0)
		{
			int digit=square%10;
				sum+=digit;
				square/=10;
		}
		if (sum==sum)
		{
			System.out.println("Neon number");
		}
		else
			System.out.println(" Not Neon number");	
	}
}
