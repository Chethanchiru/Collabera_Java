class Product_of_n_naturalno
{
	public static void main(String[] args) 
	{
		int n=5;
		int product=1;
		for (int i=1;i<=n;i++ )
		{
			product=product*i;
		}
		System.out.println("product of n natural numbers:" +product);
	}
}
