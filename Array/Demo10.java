// wajp to sort the elements in an array in descending order
import java.util.Scanner;
class Demo10 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int [a];
		System.out.println("Enter the values");
		for (int i=0;i<a;i++)
		{
			b[i]=s.nextInt();}
		int temp=0;
		for (int i=0;i<a-1;i++) 
		{
			for (int j=i;j<a;j++)
			{
			if (b[i]<b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}

			}
		}

		System.out.println("the values you entered");
		for (int i=0;i<a;i++)
		{
			System.out.println(b[i]+"");
		}
	}
}
