class SimCard 
{
	private int number;
	private String service_provider;
	private double local_call_rate;

	public int getnumber()
	{
		return number;
	}

	public String getservice_provider()
	{
		return service_provider;
	}

	public void setservice_provider(String service_provider)
	{
		this.service_provider=service_provider;
	}
	
	public double getlocal_call_rate()
	{
		return local_call_rate;
	}

	public void setlocal_call_rate(double local_call_rate)
	{
		this.local_call_rate=local_call_rate;
	}

	public void printSimDetails()
	{
		System.out.println("Sim number:" +number);
		System.out.println("Sim service_provider:" +service_provider);
		System.out.println("Sim local_call_rate:" +local_call_rate);
	}
	

	SimCard()
	{
		
	}

	SimCard(int number )
	{
		this.number=number;
	}

	SimCard(int number, String service_provider )
	{
		this(number);
		this.service_provider=service_provider;
	}

	SimCard(int number, String service_provider, double local_call_rate )
	{
		this(number, service_provider);
		this.local_call_rate=local_call_rate;
	}

  public static void main(String[] args) 
	{
		SimCard s=new SimCard(7760, "Airtel", 2);
		System.out.println(s.getnumber());
		s.setservice_provider("Jio");
		System.out.println(s.getservice_provider());
		s.setlocal_call_rate(3);
		System.out.println(s.getlocal_call_rate()); 
	}
}
