//public inside pack2  use import statement for pack1
package pack2;
import pack1.A;

public class B
{
	int c=30;
	static int d=25; 
	
	public static void B()
	{
		System.out.println("pack2 static");
	}

	public void B1()
	{
		System.out.println("pack2 non static");
	}

	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.A1();
		A.A();
	}

}
