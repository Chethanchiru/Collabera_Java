
import java.util.*;
class Sentence
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence1=s.nextLine().trim();
		HashSet hs= new HashSet();

		for (int i=0;i<sentence1.length();i++ )
		{
			hs.add(sentence1.charAt(i));
		}
			System.out.println("the characters with out repetation is : " +hs.size()+ hs);		
	}
}
