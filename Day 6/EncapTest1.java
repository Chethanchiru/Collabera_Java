class Number 
{
	private int id=111;
	
	public int getID()
	{
		return id;
	}

	public void setID(int id)
	{
		this.id=id;
	}
}


class EncapTest1
{
	public static void main(String[] args) 
	{
		Number n=new Number();
		n.setID(156);
		n.getID();
		System.out.println(n.getID());
	}
}