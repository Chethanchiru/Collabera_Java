class Tree 
{
	String name;
	String lifespan;

	Tree()
	{
		
	}

	Tree(String name, String lifespan)
	{
		this.name=name;
		this.lifespan=lifespan;
	}

	Fruit f;
	
	void FruitGrown()
	{
		f=new Fruit("Mango", "Sweet");
		System.out.println("Fruit is ready to be plucked");
	}

	public void treeDetails()
	{
		System.out.println(name);
		System.out.println(lifespan);		
	}
}


class Fruit 
{
	String name;
	String type;

	Fruit()
	{
		
	}

	Fruit(String name, String type)
	{
		this.name=name;
		this.type=type;
	}

	public void FruitDetails()
	{
		System.out.println(name);
		System.out.println(type);		
	}
}


class Driver4
{
	public static void main(String[] args) 
	{
		Tree t=new Tree("Mango Tree", "50 years");
		t.treeDetails();
		
		t.FruitGrown();	
		t.f.FruitDetails();
	}
}















	
