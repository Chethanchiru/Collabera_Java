import java.util.*;
import java.io.*;

class Serialization 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout= new FileOutputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\Employee.java");
		System.out.println("sucessfully file is created");
		ObjectOutputStream obj= new ObjectOutputStream(fout);
		
		Employee e=new Employee(667, "Chethan", 25000);
		System.out.println("seralization is done");
		obj.writeObject(e);
		
		System.out.println("sucessfully stored");
		obj.close();

		// Deserialization
		FileInputStream fin= new FileInputStream("D:\\chethan\\QCCO1\\Testyantra Activity\\Filehandling\\Employee.java");
		ObjectInputStream obj1= new ObjectInputStream(fin);
		System.out.println(obj1.readObject());
		obj1.close();
	}
}

class Employee implements Serializable
{
	int eid;
	String name;
	double salary;

	Employee (int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString(){
	return "Employee [eid=" +eid+ ",name=" +name+ ",salary=" + salary +"]";
	}
}