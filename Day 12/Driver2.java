class Processor
{
	 String speed;
	 String  generation;
	
	Processor() {}
		
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

class Laptop 
{
	String Ram;
	String os;
	String brand;
		
	Processor p=new Processor("8 GB", "6th generation");
	
	void displayAttributes()
	{
		System.out.println(brand);
		System.out.println(mrp);
	}

	Laptop() {}

	Laptop(String Ram,String os, String brand)
	{
		this.Ram=Ram;
		this.os=os;
		this.brand=brand;
	}
}


class Driver2
{
	public static void main(String[] args) 
	{
		Laptop l=new Laptop("8 GB", "Windows", "Apple");
		l.p.displayAttributes();
		System.out.pritln();
		l.displayAttributes();
	}
	
}








