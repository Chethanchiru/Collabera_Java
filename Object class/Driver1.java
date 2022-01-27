class Laptop 
{
	String ram;
	String rom;
	String processor_speed;

	Laptop(String ram, String rom, String processor_speed)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor_speed=processor_speed;
	}

	@Override
	public String toString()
	{
		return "ram: = "+ ram + "rom: = " + rom + "processor_speed: = " + processor_speed;
	}


	@Override
	public boolean equals(Object o)
	{
		Laptop l=(Laptop) o;
		if (this.ram==l.ram)
		{
			return true;
		}
		else if (this.rom==l.rom)
		{
			return true;
		}
		else if (this.processor_speed==l.processor_speed)
		{
			return true;
		}
		else{
			return false;
		}
	}
}
class Driver1
{
	public static void main(String[] args) 
	{
		Laptop l1=new Laptop("8 GB", "2 GB", "Core i5");
		System.out.println(l1.ram);
		System.out.println(l1.rom);
		System.out.println(l1.processor_speed);
		System.out.println();
		Laptop l2=new Laptop("8 GB", "2 GB", "Core i5");
		System.out.println(l2.ram);
		System.out.println(l2.rom);
		System.out.println(l2.processor_speed);
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		System.out.println();
		Laptop l3=new Laptop("4 GB", "3 GB", "Core i6");
		System.out.println(l3.ram);
		System.out.println(l3.rom);
		System.out.println(l3.processor_speed);
		System.out.println(l2==l3);
		System.out.println(l2.equals(l3));
	}
}

	

