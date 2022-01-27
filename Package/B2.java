//protected inside same pack1 dont use import statement
package pack1;

public class B2 
{
	public static void main(String[] args)
	{
		A2 obj=new A2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.A1();
		A2.A();
	}

}
