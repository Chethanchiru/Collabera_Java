import java.util.Scanner;
class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int [size];
		int sumEven=0;
		int sumOdd=0;
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		for (int i=0;i<size;i++)
		{
			if (a[i]%2==0)
			{
				sumEven=sumEven+a[i];
			}
			else
				{
					sumOdd=sumOdd+a[i];	
				}
		}
		System.out.println("Summation of even no in an array :" +sumEven);
		System.out.println("Summation of odd no in an array :" +sumOdd);
	}
}
