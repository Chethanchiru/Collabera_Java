class Mobile 
{
	String model;
	double price;

	Sim s;
	public void getMobileDetails()
	{
		System.out.println(model);
		System.out.println(price);
	}

	public void insertSim( )
	{  s=new Sim();
		System.out.println("Sim is inserted");
	}

	public void removeSim()
	{
		s=null;
		System.out.println("Sim is not inserted");
	}

}

class Sim
{
	String simNo;
	String serviceProvider;

	public String getsimNo()
	{
		return simNo;
	}

	public void getSimDetails()
	{
		System.out.println(simNo);
		System.out.println(serviceProvider);
	}
}


class Driver3
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		
		m.insertSim( );

		System.out.println(m.s.getsimNo());

		m.s.getSimDetails();

		m.removeSim();
	}
}
4