class Laptop 
{
	String brand="Lenovo";
	double mrp=65000.00;
		
	Processor p=new Processor("8 GB", "6th generation");
	
	void displayAttributes()
	{
		System.out.println(brand);
		System.out.println(mrp);
	}

}

class Processor
{
	 String speed;
	 String  generation;
		
	Processor (String speed, String  generation)
	{
		this.speed=speed;
		this.generation=generation;
	}

		void displayAttributes()
	{
		System.out.println(speed);
		System.out.println(generation);
	}	
}
class Driver7
{
	public static void main(String[] args) 
	{
		Laptop l=new Laptop();
		l.p.displayAttributes();
		l.displayAttributes();
	}
	
}








