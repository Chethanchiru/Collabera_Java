class Parent
{
	public void test()
	{
		System.out.println("Parent Method");
	}	
} 

class Child extends Parent
{
	public void test()
	{
		System.out.println("Child Method");
	}	
} 
	

class Driver4
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.test();
		
		Parent p=new Child();
		p.test();


	}
}



