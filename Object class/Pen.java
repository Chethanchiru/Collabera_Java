class Pen 
{
	double price;

	Pen(double price)
	{
		this.price=price;
	}

	@Override
	public int hashCode()
	{
		int hc=(int)price;
		return hc;
	}

	public static void main(String[] args) 
	{
		Pen p1=new Pen(10);
		Pen p2=p1;
		Pen p3=new Pen(25);
		System.out.println(p1==p2);
		System.out.println(p1.hashCode()==p2.hashCode());
		System.out.println(p1==p3);
		System.out.println(p1.hashCode()==p3.hashCode());
	}
}














	
