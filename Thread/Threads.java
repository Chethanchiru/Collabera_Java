class Threads 
{
	public static void main(String[] args) throws InterruptedException
	{
		String name=Thread.currentThread().getName();
		System.out.println("Thread Name ="+name);//Thread Name =main
		System.out.println(Thread.currentThread().getId());//1
		System.out.println(Thread.currentThread().getPriority());//5 by default value
		System.out.println(Thread.currentThread().getState());// RUNNABLE
		System.out.println(Thread.currentThread().isDaemon());// false
		for (int i=0;i<5 ;i++ )
		{
			System.out.println(i);
			Thread.sleep(5000);// makes the thread to wait
		}	
	}
}
