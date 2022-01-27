import java.util.Scanner;
class Demo8 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int [size];

		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		for (int i=0;i<size;i++)
		{
			if ((i+1)%2==0)
			{
				System.out.println(a[i]);
			}
			else
				{
					System.out.println(a[i]);	
				}
		}
	}
}
