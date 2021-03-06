import java.util.*;

class Channel implements Comparable
{
	String name;
	double price;

	Channel(String name, double price)
	{
		this.name=name;
		this.price=price;
	}

	@Override
	public int compareTo(Object o){
		Channel c=(Channel)o;
		return (int)(this.price-c.price);
	}
}

class RegionalPack implements Comparable
{
	String name;
	double price;

	RegionalPack(String name, double price)
	{
		this.name=name;
		this.price=price;
	}

	@Override
	public int compareTo(Object o){
		RegionalPack r=(RegionalPack)o;
		return (int)(this.price-r.price);
	}
}

class TataSky
{
	String name;
	long contactno;
	String DOB;
	String Gender;
	String emailID;
	String TataSkyId;
	double balance;

	HashSet<Channel> channel=new HashSet<>();

	HashSet<RegionalPack> regionalpack=new HashSet<>();


public void addChannel()
			{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Starsports");
		System.out.println("2. Food First");
		System.out.println("3. Anime");
		System.out.println("4. NDTV");
		System.out.println("enter your choice");
		int a1 =s.nextInt();
		System.out.println("*************Welcome to TataSky***************");
		switch(a1)
		{
		case 1 : {channel.add(new Channel("Starsports", 20));
		System.out.println("Starsports channel is successfully added");}
		break;
		case 2 : {channel.add(new Channel("Food First", 25));
		System.out.println("Food First channel is successfully added");}
		break;
		case 3 : {channel.add(new Channel("Anime", 30));
		System.out.println("Anime channel is successfully added");}
		break;
		case 4 : {channel.add(new Channel("NDTV", 50));
		System.out.println("NDTV channel is successfully added");}
		break;
		}
	}

public void addregionalpack()
			{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Sports");
		System.out.println("2. Food");
		System.out.println("3. Kids");
		System.out.println("4. Cooking");
		System.out.println("enter your choice");
		int a1 =s.nextInt();
		System.out.println("*************Welcome to TataSky***************");
		switch(a1)
		{
		case 1 :{ channel.add(new Channel("Sports", 266));
		System.out.println("Sports channel is successfully added");}
		break;
		case 2 : {channel.add(new Channel("Food", 250));
		System.out.println("Food channel is successfully added");}
		break;
		case 3 : {channel.add(new Channel("Kids", 266));
		System.out.println("Kids channel is successfully added");}
		break;
		case 4 : {channel.add(new Channel("Cooking", 250));
		System.out.println("Cooking channel is successfully added");}
		break;
		}
		}

public void removechannel()
		{
		Scanner s=new Scanner(System.in);
		 System.out.println("enter the channel name to be removed");
		 String str=s.next().trim();
		 Iterator i = channel.iterator();
		 while(i.hasNext())
		{
			 Channel a=(Channel)i.next();
			 if( str.equals(a.getName()))
			{
				i.remove();
				System.out.println("your channel has been successfully removed");
			}
		}
	  }



public void removeregionalpack()
		{
		Scanner s=new Scanner(System.in);
		 System.out.println("enter the regionalpack name to be removed");
		 String str=s.next().trim();
		 Iterator i = channel.iterator();
		 while(i.hasNext())
		{
			 RegionalPack b=(RegionalPack)i.next();
			 if( str.equals(b.getName()))
			{
				i.remove();
				System.out.println("your regionalpack has been successfully removed");
			}
		}
	  }

	public void modifypack()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Add Channel");
		System.out.println("2. Add Regional Pack");
		System.out.println("3. Remove Channel");
		System.out.println("4. Remove Regional Pack");
		int a=s.nextInt();
		switch(a)
		{
			case 1 : addChannel();
						break;
			case 2 : addregionalpack();
						break;
			case 3 : removechannel();
						break;
			case 4 : removeregionalpack();
						break;
		}
	}

	public void myaccount()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("***********your personal details************");
		System.out.println("Name :" +this.name);
		System.out.println("D.O.B :" +this.DOB);
		System.out.println("Gender :" +this.Gender);
		System.out.println("Contact no :" +this.contactno);
		System.out.println("Email ID :" +this.emailID);
		System.out.println("TataSky Id :" +this.TataSkyId);
		System.out.println("Balance :" +this.balance);
		System.out.println("If you want to modify the details enter the options");
		System.out.println("1. Modify Name");
		System.out.println("2. Modify D.O.B");
		System.out.println("3. Modify Contact no");
		System.out.println("4. Modify Email ID ");
		int a3 =s.nextInt();
		switch(a3)
		{
			case 1:{
						System.out.println("enter your new name");
						String e=s.next().trim();
						setName(e);
					}
					break;
			case 2:{
						System.out.println("enter your new D.O.B");
						String e=s.next().trim();
						setDOB(e);
					}
					break;
			case 3:{
						System.out.println("enter your new Contact no");
						long l=s.next().trim();
						setContactno(l);
					}
					break;
			case 4:{
						System.out.println("enter your new Email ID ");
						String e=s.next();
						setEmailID(e);
					}
					break;
		}	
		
	}

	public void setName(String name)
	{
		System.out.println("Name is successfully updated");
		this.name=name;				
	}
	
	public void setDOB(String DOB)
	{
		System.out.println("DOB is successfully updated");
		this.DOB=DOB;				
	}
	
	public void setContactno(long contactno)
	{
		System.out.println("contact no is successfully updated");
		this.contactno=contactno;				
	}

	public void setEmailID(String emailID)
	{
		System.out.println("Email ID is successfully updated");
		this.emailID=emailID;				
	}

public void recharge()
{
	double sum=0;
	
	for (Channel a: channel )
		{
			sum=sum+a.price;
		}
		
	for (RegionalPack b: regionalpack )
		{
			sum=sum+b.price;
		}

		System.out.println("The total amount for the channels & regional pack =" +sum);
		System.out.println("Enter the amount to recharge");
		Scanner s=new Scanner(System.in);
		if (sum==s.nextInt())
		{
			System.out.println("Recharge is done successfully");
		}

}
}

class Driver3
{
	public static void main(String[] args)
	{ TataSky t = new TataSky();
	Scanner s = new Scanner(System.in);
	boolean f =true;
	
	do {
		System.out.println("Enter the Name");
		t.name=s.next();
		System.out.println("Enter the DOB");
		t.DOB=s.next();
		System.out.println("Enter the Gender");
		t.DOB=s.next();
		System.out.println("Enter the Contact no");
		t.contactno=s.nextLong();
		System.out.println("Enter the Email ID");
		t.emailID=s.next();
		System.out.println("Enter the Balance");
		t.balance=s.nextDouble();
		System.out.println("Enter the TataSkyId");
		t.TataSkyId=s.next();
		System.out.println("Enter the things to be modified");
		System.out.println("1. modifypack");
		System.out.println("2. myaccount");
		System.out.println("4. recharge");
		System.out.println("4. exit");
		System.out.println("enter your choice");
		int a =s.nextInt();
		switch(a)
		{
		case 1 : t.modifypack();
		break;
		case 2 : t.myaccount();
		break;
		case 3: t.recharge();
		break;
		case 4: f=false;
		}
	}while(f);	
	}
}




















































