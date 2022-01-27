import java.util.*;

class Employee implements Comparable
{
	String name;
	double salary;

	Employee (String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public int compareTo(Object o)
	{
		Employee temp=(Employee)o;
		if (this.salary==temp.salary)
			return 0;
		else if (this.salary>temp.salary)
			return 1;
		else
			return -1;
	}

	public void display()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println("================");
	}



}

class Driver
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
			ls.add(new Employee("mala",10000));
			ls.add(new Employee("sheela",50000));
			ls.add(new Employee("lila",40000));


		Collections.sort(ls);
		System.out.println(ls);

		for (Object o : ls )
		{
			Employee e=(Employee)o;
			e.display();
		}

	}
}











  

	

