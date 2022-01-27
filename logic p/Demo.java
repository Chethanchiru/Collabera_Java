//Xylem and Pholem
class Demo 
{
	public static void main(String[] args) 
	{
		int num,temp;
		int x=0 ,y=0;
		num=131216;
		temp=num;
		while (num>0)
		{
			int digit=num%10;
			if ((num==temp) || (num<=9))
			{
				x+=digit;
			}
			else {
				y+=digit;
			}
			num=num/10;
		}
		if (x==y)
		{
			System.out.println("Xylem");
		}
		else {
			System.out.println("Phloem");
		}
	}
}
