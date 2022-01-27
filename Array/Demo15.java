//wajp to add unique elements in the array
import java.util.Scanner;
class Demo15 
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
		
		int sum=0;
		
		for (int i=0;i<size;i++)
		{
			int found=0;
			for (int j=i+1;j<size;j++)
			{
				if (a[i]==a[j])
				{
					found=1;
					a[j]=0;
				}
			}
			if (found==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}









		