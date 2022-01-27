class Book5 
{
	int bid;
	double price;

	Book5(int bid, double price)
	{
		this.bid=bid;
		this.price=price;
	}

	@Override
	public int hashCode()
	{
		int hc1=bid;
		double hc2=price;
		int hc=hc1+(int)hc2;
		return hc;
	}

	public static void main(String[] args) 
	{
		Book5 b1=new Book5(10, 25);
		Book5 b2=b1;
		Book5 b3=new Book5(25, 35);
		System.out.println(b1==b2);
		System.out.println(b1.hashCode()==b2.hashCode());
		System.out.println(b1==b3);
		System.out.println(b1.hashCode()==b3.hashCode());
	}
}














	
