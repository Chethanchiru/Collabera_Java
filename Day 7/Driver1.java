class Human 
{
	String name;
	int age;
	String gender;

	Food f=new Food("Green peas ricebath", "Veg", 100);
	void gethumanDetails()
	{
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Gender:" +gender);
	}
}

class Food 
{
	private String name;
	private String type;
	private double price;

	public String getname()
	{
		return name;
	}
	
	public String gettype()
	{
		return type;
	}

	public double getprice()
	{
		return price;
	}
	
	Food(String name, String type, double price)
	{
		this.name=name;
		this.type=type;
		this.price=price;
	}

	void getFoodDetails()
	{
		System.out.println("Name:" +name);
		System.out.println("Type:" +type);
		System.out.println("Price:" +price);
	}
}


 class Driver1
 {
	public static void main(String[] args) 
	{
		Human h=new Human();
		System.out.println(h.f.getname());
		System.out.println(h.f.gettype());
		System.out.println(h.f.getprice());
	}
}
 
	
