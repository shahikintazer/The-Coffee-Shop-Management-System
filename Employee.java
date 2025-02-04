package models;
import java.lang.*;

public class Employee extends User
{
	private String designation;
	private double salary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String userId, String name, String gender, int age, String email, String phoneNo, String address, int role, String securityAns, String password, String designation, double salary) {
    super(userId, name, gender, age, email, phoneNo, address, role, securityAns, password);
           this.designation = designation;
           this.salary = salary;
    }
	
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getDesignation()
	{
		return this.designation;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public String toStringEmployee()
	{
		String str=this.userId+","+this.name+","+this.gender+","+this.age+","+this.email+","+this.phoneNo+","+this.address+","+this.designation+","+this.salary+"\n";
		return str;
	}
	
	public Employee formEmployee(String str)
	{
		String data[]=str.split(",");
		
		Employee emp=new Employee();
		
		emp.setUserId(data[0]);
		emp.setName(data[1]);
		emp.setGender(data[2]);
		emp.setAge(Integer.parseInt(data[3]));
		emp.setEmail(data[4]);
		emp.setPhoneNo(data[5]);
		emp.setAddress(data[6]);
		emp.setDesignation(data[7]);
		emp.setSalary(Double.parseDouble(data[8]));
		
		return emp;
	}
	
}