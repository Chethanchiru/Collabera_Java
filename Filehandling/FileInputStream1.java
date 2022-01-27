import java.util.*;
import java.io.*;

class  FileInputStream1
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fin= new FileInputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\File1.java");
		int a=fin.available();// checks no of character avaliable
		System.out.println(a);
		System.out.println();
		for (int i=0;i<a;i++)
		{
			int b=fin.read();
			System.out.print((char)b);
		}
		fin.close();
		System.out.print("Done.............");
	}
}
