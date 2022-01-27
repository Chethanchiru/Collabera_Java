class Demo7 implements Runnable
{
	Demo7()
	{
		
	}

	public void run()
	{
		System.out.println("runnable method is executed");//runnable method is executed
	}
}

class Demo6 extends Thread
{
	Demo6()
	{
		
	}

	public void run()
	{
		System.out.println("Thread thread is executed");//Thread thread is executed
	}
}

class DriveThread2
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Demo7());
		Demo6 t2=new Demo6();
		System.out.println(t1.getName());//Thread-0
		t1.start();
	
		System.out.println(t2.getName());//Thread-1
		t2.start();
	}
}
