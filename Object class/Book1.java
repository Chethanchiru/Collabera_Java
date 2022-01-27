class Book1 
{
		String bname;
		Book1(String bname)
		{
			this.bname=bname;	
		}

	public static void main(String[] args) 
	{
		Book1 b1=new Book1("java");
		Book1 b2=new Book1("java");;
		System.out.println(b1.bname);//java
		System.out.println(b2.bname);//java
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//false
	}
}
