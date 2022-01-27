class Demo7 extends Thread
{
	Demo7(String s)
	{
		super(s);
	}

	public void run()
	{
		System.out.println("run method is executed");//run method is executed
	}
}

class DriveThread
{
	public static void main(String[] args) 
	{
		Demo7 d=new Demo7("Thread 0");
		d.start();
		System.out.println(d.getName());//Thread 0
		System.out.println(d.getId());//14
		System.out.println(d.getPriority());// 5
	}
}
