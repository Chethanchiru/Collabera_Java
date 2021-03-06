import java.util.Scanner;
class Ball 
{
	private double radius;
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
}

class BasketBall extends Ball
{
	String game="Basket";
}

class TennisBall extends Ball
{
	String game="Tennis";
}


class Bag 
{
	Ball ball;

	public void addBall(Ball ball)
	{
		this.ball=ball;
	}
		
	public void removeBall()
	{
		ball=null;
	}

	public void isBagEmpty( )
	{

	if (ball==null)
			System.out.println("bag is empty");
		else
			System.out.println("bag is not empty");
	}
			
	public void showGame()
	{
		if (ball instanceof BasketBall)
		{
			BasketBall b=(BasketBall) ball;
			System.out.println("you can play"+b.game+"ball game");
		}
		else 
			{
				TennisBall b=(TennisBall)ball;
				System.out.println("you can play"+b.game+"ball game");
			}
	}	
}

class Driver
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Bag bag = new Bag();
		boolean flag = true;
		do
		{
			System.out.println("*****************************");
			System.out.println("1 -- Add Ball");
			System.out.println("2 -- Remove Ball");
			System.out.println("3 -- Check Bag is Empty or not");
			System.out.println("4 -- Show game that can be played");
			System.out.println("5 -- Exit");
			System.out.println("please enter your choice");
			System.out.println("*****************************");
			int a = s.nextInt();
				switch(a)
				{
					case 1:{
							System.out.println("1 -- BasketBall");
							System.out.println("2 -- TennisBall");
							System.out.println("please enter your choice");
					int b=s.nextInt();
				switch (b)
				{
				case 1:{
							bag.addBall(new BasketBall());
							System.out.println("Basket Ball is successfully added");
						}
						break;
				case 2:{
							bag.addBall(new TennisBall());
							System.out.println("Tennis Ball is successfully added");
						}
					}
				}
				break;
			case 2:{
						bag.removeBall();
						System.out.println("Ball is successfully removed in to the bag");
					}
					break;
			case 3: bag.isBagEmpty();
					break;
			case 4: bag.showGame();
					break;
			case 5: flag=false;
	}
}
while (flag);	
	}}

