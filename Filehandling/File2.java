import java.util.*;
import java.io.*;

class  File2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=s.nextLine();
		FileOutputStream fout=null;
		try
		{
			fout = new FileOutputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\file1.txt");
			System.out.println("file is successfully created");
		}
		catch (FileNotFoundException f)
		{
			System.out.println("the specified path is not found or operating system is not allowing to create a file");
		}
		 
		for (int i=0;i<str.length();i++)
		{
			try
			{
				fout.write(str.charAt(i));
			}
			catch (IOException e)
			{
				System.out.println("IOException is handled");
			}
			
		}
		try
		{
			fout.close();
		}
		catch (IOException e)
		{
			System.out.println("IOException is handled");
		}
		
	}
}
