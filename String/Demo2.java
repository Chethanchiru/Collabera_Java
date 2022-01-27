class Demo2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1, sb2;
		sb1=new StringBuffer("Hello");
		sb2=sb1;
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.append("world");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
