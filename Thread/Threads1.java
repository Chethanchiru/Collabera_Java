class Threads1
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t=new Thread();
		System.out.println(Thread.currentThread().getName());// main
		System.out.println(t.getName());// Thread-0
	}
}
