//WAJP to count no of even factors and odd factors of given number
class Driver7 
{
	public static void main(String[] args) 
	{
		int num=6;
		int counteven=0;
		int countodd=0;
		for (int i=1;i<=num;i++ )
		{
			if (num%i==0)
			{
				if (i%2==0)
				{
					counteven++;
				}
				else
				{
					countodd++;
				}
				
			}                                  
		}	
	System.out.println(counteven);
	System.out.println(countodd);
}
}
