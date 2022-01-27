class Car 
{
	String model;
	double price;
	String color;
	
	Engine e=new Engine("KA 4160", 100);
	
	void getCarDetails()
	{
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);
	}

}

class Engine
{
	private String engineNo;
	private double cc;

		String getengineNo()
		{
			return engineNo;	
		}

		double getcc()
		{
			return cc;	
		}
		
		Engine(String engineNo, double cc)
	{
		this.engineNo=engineNo;
		this.cc=cc;
	}

		void getEngineDetails()
	{
		System.out.println(engineNo);
		System.out.println(cc);
	}

	
}
class Driver 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println(c.e.getengineNo());
		System.out.println(c.e.getcc());
		c.e.getEngineDetails();
	}
	
}








