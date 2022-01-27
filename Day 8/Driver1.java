class HomePage 
{
	String pickup;
	String Destination1;	
}

class Auto extends HomePage
{
	String cost_per_km;
}

class Mini extends HomePage
{
	String cost_per_km;
}

class Prime extends HomePage
{
	String cost_per_km;
}

class Ola
{
	String name;
	String cno;
	
	HomePage h;

	public void bookRide(HomePage h)
	{
		this.h=h;
	}

	public void CancelRide( )
	{
		this.h=null;
	}

	public void bookRide(HomePage h)
	{
		this.h=h;
	}






}








































	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
