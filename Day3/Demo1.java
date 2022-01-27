import java.util.Scanner;
class Demo1
{ 
	public static int addition(int a, int b)
{
	int res=a+b;
	return res;
}

public static void main(String[] args) 
{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter an integer number");
		int a =s.nextInt();
		int b =s.nextInt();
		System.out.println((addition(a,b)));
	}
}
