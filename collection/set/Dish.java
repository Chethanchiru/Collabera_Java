public class Dish implements Comparable
{
	private int id;
	private double price;
	private String name ;
	private String description;
	public Dish(int id, double price, String name, String description) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(Object o)
	{
		Dish i =(Dish)o;
		return (int)(this.price-i.price);
	}
	
}