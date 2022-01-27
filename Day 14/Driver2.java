import java.util.Scanner;
class Dog extends Animal 
{
	int price = 30000;
	String colour = "brown";
	String age1  = "10 months";
}
class Cat extends Animal
{
int price = 20000;
String age = " 2 months";

}

class Parrot extends Bird
{
int price = 1000;
String age = "5 months";

}

class Pigeon extends Bird
{
int price = 1000;
String age = "2 months";


}

class Animal
{
public Dog addDog()
{
Dog d = new  Dog();
return d;
}
public Cat addCat()
{
Cat c = new Cat();
return c;
}
}


class Bird
{
public Parrot addParrot()
{
Parrot pa = new Parrot();
return pa;
}
public Pigeon addPigeon()

{
Pigeon pe = new Pigeon();
return pe;
}
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

class Cat extends Animal
{
	double price = 2000.0;
	String color = "White";
	String age = "2 months";
}

class Dog extends Animal
{
	double price = 3000.0;
	String color = "Black";
	String age = "10 months";
}

class Bird
{
	public Pegion addPegion()
	{
		return new Pegion();
	}

	public Parrot addParrot()
	{
		return new Parrot();
	}
}

class Pegion extends Bird
{
	double price = 500.0;
	String age = "1 months";
}

class Parrot extends Bird
{
	double price = 1000.0;
	String age = "5 months";
}

class Cart
{
	Animal animal;
	Bird bird;

	public void addToCart(int option)
	{
		Scanner s = new Scanner(System.in);
		switch (option)
		{
			case 1: System.out.println("1. Add Dog");
					System.out.println("2. Add Cat");
					System.out.println();
					System.out.println("Enter your choice");
					int c1 = s.nextInt();
					System.out.println();
					animal = new Animal();
					switch (c1)
					{
					case 1: this.animal = animal.addDog();
							System.out.println("Woff woff! Dog is added to the cart!");
							System.out.println("-------------------------------------------------------------");
							break;
					case 2: this.animal = animal.addCat();
							System.out.println("Meow! Cat is added to the cart!");
							System.out.println("-------------------------------------------------------------");
							break;
					default:System.out.println("Invalid Choice");
							System.out.println("-------------------------------------------------------------");
					}
					break;
			case 2:	System.out.println("1. Add Parrot");
					System.out.println("2. Add Pegion");
					System.out.println();
					System.out.println("Enter your choice");
					int c2 = s.nextInt();
					System.out.println();
					bird = new Bird();
					switch (c2)
					{
					case 1: this.bird = bird.addParrot();
							System.out.println("Good morning-Good morning!! Parrot is added to the cart!");
							System.out.println("-------------------------------------------------------------");
							break;
					case 2: this.bird = bird.addPegion();
							System.out.println("Tweet tweet! Pegion is added to the cart!");
							System.out.println("-------------------------------------------------------------");
							break;
					default:System.out.println("Invalid Choice");
							System.out.println("-------------------------------------------------------------");
					}
					break;
			default:System.out.println("Invalid Choice");
			System.out.println("-------------------------------------------------------------");
		}
	}

	public void isEmpty()
	{
		if (animal == null && bird == null)
		{
			System.out.println("Yes, the cart is empty!");
			System.out.println("-------------------------------------------------------------");
		}
		else 
		{
			System.out.println("No, the cart is not empty!");
			System.out.println("-------------------------------------------------------------");
		}
	}

	public void display()
	{
		if (animal != null)
		{
			if (animal instanceof Dog)
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Dog is in the Cart");
				System.out.println("Dog's Price: "+((Dog)animal).price);
				System.out.println("Dog's Color: "+((Dog)animal).color);
				System.out.println("Dog's Age: "+((Dog)animal).age);
				System.out.println("-------------------------------------------------------------");
			}
			else
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Cat is in the Cart");
				System.out.println("Cat's Price: "+((Cat)animal).price);
				System.out.println("Cat's Color: "+((Cat)animal).color);
				System.out.println("Cat's Age: "+((Cat)animal).age);
				System.out.println("-------------------------------------------------------------");
			}
		}
		
		if (bird != null)
		{
			if (bird instanceof Pegion)
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Pegion is in the Cart");
				System.out.println("Pegion's Price: "+((Pegion)bird).price);
				System.out.println("Pegion's Age: "+((Pegion)bird).age);
				System.out.println("-------------------------------------------------------------");
			}
			else
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Parrot is in the Cart");
				System.out.println("Parrot's Price: "+((Parrot)bird).price);
				System.out.println("Parrot's Age: "+((Parrot)bird).age);
				System.out.println("-------------------------------------------------------------");
			}
		}
		
		if (animal == null && bird == null)
		{
			System.out.println("The cart is empty!");
			System.out.println("-------------------------------------------------------------");
		}
	}
}

class Driver2
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);

		Cart c = new Cart();

		System.out.println();
		System.out.println("*********Welcome to Pet Store*********");

		while (true)
		{
			System.out.println();
			System.out.println("1. Add pet to cart");
			System.out.println("2. Is the cart empty?");
			System.out.println("3. Display what is in the cart");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = s.nextInt();
			System.out.println();

			if (choice == 4)
			{
				break;
			}

			switch (choice)
			{
			case 1: System.out.println("1. Animal");
					System.out.println("2. Bird");
					System.out.println();
					System.out.println("Enter your choice");
					int option = s.nextInt();
					System.out.println();
					c.addToCart(option);
					break;
			case 2:	c.isEmpty();
					break;
			case 3: c.display();
					break;
			default:System.out.println("Invalid choice");
			System.out.println("-------------------------------------------------------------");
			}
		}
		System.out.println();
		System.out.println("**********Thank your for visiting**********");
	}
}