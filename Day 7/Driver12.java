class Fruit 
{
	String apple="red";
}

class Vegetable extends Fruit
{
	String cabbage="Green";
}


class Driver12
{
	public static void main(String[] args) 
	{
		Fruit f=new Fruit();
		System.out.println(f.apple);
		Vegetable v=new Vegetable();
		
		Vegetable v2=(Vegetable)new Fruit();
		
		Fruit f1=(Vegetable)new Fruit();

	
		
	}
}





