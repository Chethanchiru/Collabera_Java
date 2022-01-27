class Book4 
{
		String bname;
		Book4(String bname)
		{
			this.bname=bname;	
		}

		@Override
		public boolean equals(Object o)
		{
			Book4 b=(Book4)o;
			if (this.bname==b.bname)
			{
				return true;
			}
			else
				return false;
		}

	public static void main(String[] args) 
	{
		Book4 b1=new Book4("java");
		Book4 b2=b1;;
		System.out.println(b1.bname);//java
		System.out.println(b2.bname);//java
		System.out.println(b1==b2);//true
		System.out.println(b1.equals(b2));//true
	}
}
