import java.util.*;
import java.io.*;


class Read extends Thread
{
	public void run()
	{
		Drive.read();
		System.out.println("read thread completed");
	}
}

class Write extends Thread
{
	public void run()
	{
		Drive.write();
		System.out.println("Write thread completed");
	}
}

public class Drive
{
	public static void read()
	{
		try
		{
			FileInputStream fin= new FileInputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\file3.txt");
			int a=fin.read();
			while (a!=-1)
			{
				Thread.sleep(2000);//thread.sleep exception is handled in try block
				System.out.print((char)a);
				a=fin.read();	
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception is handled");
		}
	}

	public static void write()
	{
		try
		{
			FileOutputStream fout= new FileOutputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\file3.txt");
			String str="chethan";
			for (int i=0;i<str.length();i++)
		{
			fout.write(str.charAt(i));
			Thread.sleep(2000);
		}
		}
		catch (Exception e)
		{
			System.out.println("Exception is handled");
		}
	}


	public static void main(String[] args) 
	{
		Read r=new Read();
		Write w=new Write();
		r.start();
		w.start();
}
}
		