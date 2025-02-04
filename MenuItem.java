package models;
import java.lang.*;

public class MenuItem
{
	private String itemId;
	private String name;
	private String catagory;
	private float price;
	private int availability;
	private String details;
	
	public MenuItem()
	{
	}
	
	public MenuItem(String itemId, String name, String catagory, float price, int availability, String details)
	{
		this.itemId=itemId;
		this.name=name;
		this.catagory=catagory;
		this.price=price;
		this.availability=availability;
		this.details=details;
	}
	
	public void setItemId(String itemId)
	{
		this.itemId=itemId;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCatagory(String catagory)
	{
		this.catagory=catagory;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}
	
	public void setAvailability(int availability)
	{
		this.availability=availability;
	}
	
	public void setDetails(String details)
	{
		this.details=details;
	}
	
	public String getItemId()
	{
		return this.itemId;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getCatagory()
	{
		return this.catagory;
	}
	
	public float getPrice()
	{
		return this.price;
	}
	
	public int getAvailabilitiy()
	{
		return this.availability;
	}
	
	public String getDetails()
	{
		return this.details;
	}
	
	public String toStringBook()
	{
		String str=this.itemId+","+this.name+","+this.catagory+","+this.price+","+this.availability+","+this.details+"\n";
		return str;
		
	}
	
	public MenuItem formMenuItem(String str)
	{
		String data[]=str.split(",");
		
		MenuItem m=new MenuItem();
		m.setItemId(data[0]);
		m.setName(data[1]);
		m.setCatagory(data[2]);
		
		m.setPrice(Float.parseFloat(data[3]));
		m.setAvailability(Integer.parseInt(data[4]));
		m.setDetails(data[5]);
		
		return m;
	}
	
}