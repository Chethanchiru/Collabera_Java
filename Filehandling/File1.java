import java.util.*;
import java.io.*;

class  File1
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=s.nextLine();
		FileOutputStream fout= new FileOutputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\file.txt");
		System.out.println("file is successfully created");
		for (int i=0;i<str.length();i++)
		{
			fout.write(str.charAt(i));
		}
		fout.close();
	}
}
