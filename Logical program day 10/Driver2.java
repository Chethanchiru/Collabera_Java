// WAJP to check whether the given number is palindrome or not
class Driver2 
{
	public static void main(String[] args) 
	{
		int rev=0, rem;
		int num=1221;
		int num1=num;
		while (num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (num1==rev)
		{
			System.out.println("it is a palindrome");
		}
		else 
			System.out.println("it is a not a palindrome");
	}
}
