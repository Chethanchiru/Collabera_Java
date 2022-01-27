 // WAJP to check whether given number is prime or not
class Driver3 
{
	public static void main(String[] args) 
	{
		int j=1;
		int num=7;
		
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
				{
				System.out.println("it not a prime number");
				break;
				}
			else
				{
					j=2;
				}
			}	

			if (j==2)
			System.out.println("prime number");
		}
		
	}
