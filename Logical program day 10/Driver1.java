// WAJP to reverse a number
class Driver1 
{
	public static void main(String[] args) 
	{
		int rev=0, rem;
		int num=1234;
		while (num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}
