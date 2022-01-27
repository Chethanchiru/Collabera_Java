//wajp to search an element in an array binary search 
import java.util.*;
class Demo12 
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

		int low=0;
		int high=a.length-1;
		int mid=0;

		Arrays.sort(a);
		System.out.println("Enter the key element");
		int key=s.nextInt();
		boolean flag=false;

		while (low<=high)
		{
			mid=(low+high)/2;
			if (key==a[mid])
			{
				flag=true;
				break;
			}
			else if (key>a[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
		}
		if (flag==true)
		{
			System.out.println("element is found");
		}
		else
			System.out.println("element is not found");
	}
}



















		
