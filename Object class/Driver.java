class Shape 
{

}

class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}

	@Override
	public String toString()
	{
		return "radius: = " +radius;
	}
}


class Rectangle extends Shape
{
	int length;
	int breadth;
	
	Rectangle() {}
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public String toString()
	{
		return "length: = " +length + "breadth: = " + breadth;
		//return "breadth: = " +breadth;
	}

}


class Driver
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle(5);
		System.out.println(c1);
	
		Rectangle r1=new Rectangle(15, 20);
		System.out.println(r1);

	}
}




	
