import java.util.Scanner; 
class Dog extends Animal 
{
	double price=30000;
	String colour="Black";
	String age="10 months";
}

class Cat extends Animal
{
	double price=20000;
	String colour="White";
	String age="2 months";
}

class Animal
{
	public Dog addDog()
	{
		return new Dog();
	}
	
	public Cat addCat()
	{
		return new Cat();
	}
}


class Parrot extends Bird 
{
	double price=5000;
	String age="1 months";
}

class Pegion extends Bird
{
	double price=1000;
	String age="5 months";
}

class Bird
{
	public Parrot addParrot()
	{
		return new Parrot();
	}
	
	public Pegion addPegion()
	{
		return new Pegion();
	}
}

class Cart
{
	Animal a;
	public void addAnimal(Animal a)
	{
		this.a=a;
	
	Scanner s=new Scanner (System.in);
	System.out.println( "1. addDog() ");
	System.out.println( "2. addCat() ");
	System.out.println( "Enter your choice");
	int a1=s.nextInt();
	switch(a1)
	{
		case 1:
					a=a.addDog();
					break;
		case 2: 	a=a.addCat();
	}
}

		
	Bird b;
	public void addBird(Bird b)
	{
		this.b=b;
	
	Scanner s1=new Scanner (System.in);
	System.out.println( "1. addParrot() ");
	System.out.println( "2. addPegion() ");
	System.out.println( "Enter your choice");
	int b1=s1.nextInt();
	switch(b1)
	{
		case 1:b=b.addParrot();
					break;
		case 2:b=b.addPegion();
	}
}
		
	public void isEmpty()
	{
		if ((a==null) && (b==null))
		{
			System.out.println("Empty");
		}
		else
			System.out.println("Not Empty");
	}

	public void isdisplay()
	{
		if (a!=null)
		{
			if (a instanceof Dog)
			{
				Dog d=(Dog)a;
				System.out.println(d.price);
				System.out.println(d.colour);
				System.out.println(d.age);
			}
			else if (a instanceof Cat)
			{
				Cat c=(Cat)a;
				System.out.println(d.price);
				System.out.println(d.colour);
				System.out.println(d.age);
			}
			else if (b!=null)
			{
				
			if (b instanceof Parrot)
			{
				Parrot p=(Parrot)b;
				System.out.println(p.price);
				System.out.println(p.age);
			}
			else if (b instanceof Pegion)
			{
				Pegion p1=(Pegion)b;
				System.out.println(p1.price);
				System.out.println(p1.age);
			}
			}
		}
	}
}

class Driver
{
	public static void main (String [] args)
	{
	Cart ca=new Cart();	
	do{
	Scanner s2=new Scanner (System.in);
	System.out.println("1. addtoCart");
	System.out.println("2. isEmpty");
	System.out.println("3.  display");
	int b2=s2.nextInt();
	switch(b2)
	{
		case 1:{
				Scanner s3=new Scanner (System.in);
				System.out.println("1. addAnimal");
				System.out.println("2. addBird");
				int b3=s3.nextInt();
				switch (b3)
				{
				case 1:{
							if (b3==addAnimal())
							{
								ca.a.addAnimal(new Animal());
							}
						}
						break;
				case 2:{
							if (b3==addBird())
							{
								ca.b.addBird(new Bird());
							}
						}
						break;
				}
			}
		
			case 2:{
					ca.isEmpty();
					}
					break;
			case 3:{
					ca.isdisplay();
					}
					break;
			}
			}
			while (true);
	}
}


























