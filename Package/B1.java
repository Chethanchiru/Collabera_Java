//protected inside pack2  use import statement for pack1
package pack2;
import pack1.A1;

public class B1 extends A1
{
	public static void main(String[] args)
	{
		B1 obj=new B1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.A1();
		B1.A();
	}

}
