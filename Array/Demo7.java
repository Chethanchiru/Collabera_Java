import java.util.Scanner;
class Demo7 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		float na[]=new float[size];
		float a[]=new float[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextFloat();
		}
		
		int n=size-1;
		for (int i=0;i<a.length;i++)
		{
			na[n--]=a[i];
		}

		for (int i=0;i<a.length;i++)
		{
			System.out.println(na[i]);
		}

	}
}
