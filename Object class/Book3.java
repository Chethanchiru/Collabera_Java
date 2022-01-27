class Book3 
{
		String bname;
		Book3(String bname)
		{
			this.bname=bname;	
		}

		@Override
		public boolean equals(Object o)
		{
			Book3 b=(Book3)o;
			if (this.bname==b.bname)
			{
				return true;
			}
			else
				return false;
		}

	public static void main(String[] args) 
	{
		Book3 b1=new Book3("java");
		Book3 b2=new Book3("java");;
		System.out.println(b1.bname);//java
		System.out.println(b2.bname);//java
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//true
	}
}
