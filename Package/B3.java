//public inside same pack1  dont use import statement for pack1 and extends
package pack1;

public class B3
{
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.A1();
		A.A();
	}

}
