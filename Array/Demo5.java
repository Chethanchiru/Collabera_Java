import java.util.Scanner;
class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int [size];
		int sumEven=0;
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		for (int i=0;i<size;i++)
		{
			if ((i+1)%2==0)
			{
				sumEven=sumEven+a[i];
			}
		}
		System.out.println("Summation of even no in an array :" +sumEven);
	}
}
