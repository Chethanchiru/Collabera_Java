//armstrong number
class Driver13 
{   public static int Armcou(int num)
   { int coun=0;
       do
       { coun++;
	     num=num/10;
       }
       while (num>0);
	   
	   return coun;
   }
   public static int square(int r,int n){
	   int s=1;
	   for (int i=1;i<=n ; i++)
	   {  s=s*r;
	   }
	   
	   return s;
   }
   public static boolean armstromg(int a){
	   int cou=Armcou(a);int c=a,sum=0;
      do
      { int r=a%10;
	    sum =sum+square(r,cou);
		a=a/10;
      }
      while (a>0);
	  return sum==c;
   }
	public static void main(String[] args) 
	{
		if(armstromg(153))
			System.out.println("is Arm strong");
		else
			System.out.println("is not Arm strong");
	}
}