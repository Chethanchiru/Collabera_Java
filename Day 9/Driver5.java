class AppV1
{
	public void feature1()
	{
		System.out.println("oldest version");
	}	
} 

class AppV2 extends AppV1
{
	public void feature2()
	{
		System.out.println("new release");
	}

	public void feature1()
	{
		System.out.println("updated version");
	}
} 
	

class Driver5
{
	public static void main(String[] args) 
	{
		AppV1 v=new AppV2();
		v.feature1();
		
		AppV2 v1=new AppV2();
		v1.feature1();
	}
}



