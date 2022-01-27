import java.util.Scanner;
class  CitynameLength
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the city name");
		String Cityname=s.nextLine().trim().toUpperCase();
		System.out.println(Cityname.length());
	}
}
