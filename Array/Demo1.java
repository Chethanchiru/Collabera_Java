import java.util.Scanner;
class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		String a[]=new String [size];
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.next();
		}

		for (int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}
}
