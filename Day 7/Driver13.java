class Parent 
{
	int p=5;
}

class Child extends Parent
{
	int c=10;
}


class Driver13
{
	public static void main(String[] args) 
	{
		Child c1=new Child();
		System.out.println(c1.p);
		System.out.println(c1.c);
		
		Parent p1=new Child();
		System.out.println(p1.p);
		System.out.println(p1.c);
	}
}



	

