import java.util.Scanner;
class  SameNative
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A's native place");
		String A=s.nextLine().trim();
		System.out.println("Enter B's native place");
		String B=s.nextLine().trim();
		System.out.println(A.equals(B));
		System.out.println(A.equalsIgnoreCase(B));
		if (A.equalsIgnoreCase(B))
		{
			System.out.println("A & B belongs to same native");
		}
		else
			System.out.println("A & B does not belongs to same native");
		
	}
}
