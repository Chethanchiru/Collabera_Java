//wajp to store a&b array values in c array in zigzag order
import java.util.Scanner;
class Demo14 
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
		int a1=0;
		int b1=0;
		int i=0;
		while (i<csize)
		{
			if (a1<asize)
				c[i++]=a[a1++];
			if (b1<bsize)
				c[i++]=b[b1++];
		}

		for (int j=0;j<csize;j++){
		System.out.println(c[j]);}
}
}

