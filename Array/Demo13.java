//wajp to store a&b array values in c array
import java.util.Scanner;
class Demo13 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int asize=s.nextInt();
		int a[]=new int [asize];

		for (int i=0;i<asize;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			a[i]=s.nextInt();
		}

		System.out.println("Enter the size");
		int bsize=s.nextInt();
		int b[]=new int [bsize];

		for (int i=0;i<bsize;i++)
		{
			System.out.println("enter the "+(i+1)+" element value ");
			b[i]=s.nextInt();
		}

		int csize=asize+bsize;
		int c[]= new int[csize];
		int j=0;
		for (int i=0;i<csize;i++){
		if (i<asize)
		{
			c[i]=a[i];	
		}
		else
			c[i]=b[j++];
		}

		for (int i=0;i<csize;i++){
		System.out.println();
		System.out.println(c[i]);}
}
}

