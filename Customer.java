package models;
import java .lang.*;                             

public class Customer extends User
{
	private String membershipType;
	
	public Customer()
	{
		super();
	}
	
	public Customer(String userId, String name, String gender, int age, String email, String phoneNo, String address, int role, String securityAns, String password, String membershipType) {
    super(userId, name, gender, age, email, phoneNo, address, role, securityAns, password);
         this.membershipType = membershipType;
}
	
	public void setMembershipType(String membershipType)
	{
		this.membershipType=membershipType;
	}
	
	public String getMembershipType()
	{
		return this.membershipType;
	}
	
	public String toStringCustomer()
	{
		String str=this.userId+","+this.name+","+this.gender+","+this.age+","+this.email+","+this.phoneNo+","+this.address+","+this.membershipType+"\n";
		return str;
	}
	
	public Customer formCustomer(String str)
	{
		String data[]=str.split(",");
		
		Customer c=new Customer();
		c.setUserId(data[0]);
		c.setName(data[1]);
		c.setGender(data[2]);
		c.setAge(Integer.parseInt(data[3]));
		c.setEmail(data[4]);
		c.setPhoneNo(data[5]);
		c.setAddress(data[6]);
		c.setMembershipType(data[7]);
		
		return c;
	}
}

	