//Default inside pack2  use import statement for pack1
package pack2;
import pack1.A4;

class B4 extends A4
{
	public static void main(String[] args)
	{
		B4 obj=new B4();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.A4();
		B4.A();
	}

}
