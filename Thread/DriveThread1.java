class Demo7 implements Runnable
{
	Demo7(String s)
	{
		
	}

	public void run()
	{
		System.out.println("run method is executed");//run method is executed
	}
}

class DriveThread1
{
	public static void main(String[] args) 
	{
		Thread d=new Thread(new Demo7("Chethan"));
		d.start();
		System.out.println(d.getName());//Thread 0
		System.out.println(d.getId());//14
		System.out.println(d.getPriority());// 5
	}
}
