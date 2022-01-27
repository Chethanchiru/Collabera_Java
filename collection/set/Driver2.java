import java.util.*;
 class Bill
{
	private ArrayList dishes=new ArrayList();
	private int order_no;
	private String date;
	private String time;
	static double sum=0;
	Scanner s = new Scanner(System.in);
	public ArrayList getDishes() {
		return dishes;
	}
	public void setDishes(ArrayList dishes) {
		dishes = dishes;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	} 
	public void addDish()
	{
		System.out.println("1.idly");
		System.out.println("2.dosa");
		System.out.println("enter your choice");
		int a =s.nextInt();
		switch(a)
		{
		case 1 : dishes.add(new Dish(1,30,"idly","......"));
		break;
		case 2 : dishes.add(new Dish(2,50,"dosa",".........."));
		break;
		
		
	
		}
	}
	public void removedish()
	{
		 System.out.println("enter the dish to be removed");
		 String str=s.next().trim();
		 Iterator i = dishes.iterator();
		 while(i.hasNext())
		{
			 Dish d=(Dish)i.next();
			 if( str.equals(d.getName()))
			{
				i.remove();
			}
		}


		 
		/* for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			if( str.equals(d.getName()))
			{
				dishes.remove(o);
			}
		 }*/
		 
	}
	public void search()
	{
		System.out.println("enter the name of the dish to be searched");
		String str=s.next().trim();
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			if( str.equals(d.getName()))
			{
				System.out.println("the dish is avilable"+dishes.indexOf(o));
			}
				 
		 }
		
	}
	public void sortByPrice()
	{
		Collections.sort(dishes);
	}
	
	public void calculateTotal()
	{ 
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			sum+=d.getPrice();
				 
		 }
		
	}
	
	public void generatebill()
	{ if(dishes==null)
	{
		return;
	}
		System.out.println("************************");
		System.out.println("Date       :   17-12-2021");
		System.out.println("Time       :       5:00PM");
		System.out.println("-------------------------");
		System.out.println("Dish                Price");
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			 System.out.println(d.getName()+"                     "+d.getPrice());
			  
		 }
		System.out.println("-------------------------");
		System.out.println("Total                  "+sum);
		System.out.println("SGST                     5%");
		System.out.println("CGST                     5%");
		System.out.println("Total                  "+(sum*1.1));
		System.out.println("Total amount to be paid is Rs "+(sum*1.1)+" only");
		System.out.println("************************");
		sum=0;
		System.out.println(sum);
	}
	
}

class Driver2
{
	public static void main(String[] args)
	{ Bill b = new Bill();
	Scanner s = new Scanner(System.in);
	boolean f =true;
	
	do {
		System.out.println("1.add dish");
		System.out.println("2. remove dish");
		System.out.println("3. search ");
		System.out.println("4. sort dish");
		System.out.println("5. generate bill");
		System.out.println("6. exit");
		System.out.println("enter your choice");
		int a =s.nextInt();
		switch(a)
		{
		    
		case 1 : b.addDish();
		break;
		case 2 : b.removedish();
		break;
		case 3: b.search();
		break;
		case 4: b.sortByPrice();
		break;
		case 5:{b.calculateTotal();
			     b.generatebill();}
		break;
		case 6: f=false;
		
		}
	}while(f);
		
		
	}
}