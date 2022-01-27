class  ReverseStringPalindrome
{
	public static void main(String[] args) 
	{
		String ss="roor";
		StringBuffer sb=new StringBuffer(ss);
		StringBuffer revb=new StringBuffer();
		for (int i=sb.length()-1;i>=0;i--)
		{
			revb.append(sb.charAt(i));
		}
		
		String revs = new String(revb);
	
			if (ss.equals(revs))
			{
				System.out.print(ss+ " : palindrome");
			}
			else
				System.out.print(ss+ " : not a palindrome");	
	}
}
