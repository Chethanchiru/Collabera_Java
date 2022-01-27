class Parent 
{
	int num=40;
	String name;
	{
		System.out.println("non-static");
	}
}

class Child extends Parent
{
	int a=36;
	{
		System.out.println("non-static child");
	}
}

class Driver2
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.num);
		System.out.println(c.name);
		
		Parent p=new Parent();
		//System.out.println(p.a);
	}	
}

	

