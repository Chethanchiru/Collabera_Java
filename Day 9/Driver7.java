class AppV1
{
	public A feature1()
	{
		System.out.println("oldest version");
		return new A();
	}	
} 

class AppV2 extends AppV1
{
	public void feature2()
	{
		System.out.println("new release");
	}

	public B feature1()
	{
		System.out.println("updated version");
		return new B();
	}
} 
	

class Driver7
{
	public static void main(String[] args) 
	{
		AppV1 v=new AppV2();
		v.feature1();
		
		AppV2 v1=new AppV2();
		v1.feature1();
	}
}



