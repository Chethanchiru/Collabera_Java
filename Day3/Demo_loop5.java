import java.util.Scanner;
class Demo_loop5
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int temp=0;
		while (num>0)
		{
			temp=num%10;
			System.out.print(temp);
			num=num/10;
		}
				//System.out.println(sum);
	}
}

