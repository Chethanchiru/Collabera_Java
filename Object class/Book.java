class Book 
{
		String bname;
		Book(String bname)
		{
			this.bname=bname;	
		}

	public static void main(String[] args) 
	{
		Book b1=new Book("java");
		Book b2=b1;
		System.out.println(b1.bname);//java
		System.out.println(b2.bname);//java
		System.out.println(b1==b2);//true
		System.out.println(b1.equals(b2));//true
	}
}
