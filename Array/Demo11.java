//wajp to search an element in an array linear search 
import java.util.Scanner;
class Demo11 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values");
		int size=s.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the key");
		int key=s.nextInt();

		for (int i=0;i<size;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		for (int i=0;i<a.length;i++)
		{
			if (a[i]==key)
			{
				System.out.println("key is found" +a[i]);
				break;
			}
		}
	}
}


		
