import java.util.Scanner;
class Demo3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int [size];
		int sum=0;
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		for (int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum :" +sum);
	}
}
