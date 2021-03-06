class Demo7 implements Runnable
{
	Demo7()
	{
		
	}

	public void run()
	{
		System.out.println("Runnable thread is executed");//runnable method is executed

		try
		{
			Thread.sleep(3000);//thread.sleep exception is handled in try block
		}
		catch (Exception e)// catch block will not get executed bcz thread-0 & thread-1 are not interrupting each other
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Runnable thread is executed");
	}
}

class Demo6 extends Thread
{
	Demo6()
	{
		
	}

	public void run()
	{
		System.out.println("Thread thread is executing");//Thread thread is executed
	
		try
		{
			Thread.sleep(3000);//thread.sleep exception is handled in try block
		}
		catch (Exception e)// catch block will not get executed bcz thread-0 & thread-1 are not interrupting each other
		{
			System.out.println("Exception is handled");
		}
		System.out.println("Thread thread is executed");
	}
}

class DriveThred
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Demo7());
		Demo6 t2=new Demo6();
		
		t1.start();
		t2.start();
		System.out.println(t1.getName());//Thread-0
		System.out.println(t2.getName());//Thread-1
		
	}
}


// output
/*
Thread-0
Thread-1
Thread thread is executing
Runnable thread is executed
Runnable thread is executed
Thread thread is executed
*/