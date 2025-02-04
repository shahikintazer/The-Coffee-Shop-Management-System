package models;
import java.lang.*;

public class Order
{
	private String orderId;
	private String itemId;
	private String userId;
	private int quantity;
	private String orderDate;
	private String status;
	
	public Order()
	{
	}
	
	public Order(String orderId, String itemId, String userId,int quantity, String orderDate,String status)
	{
		this.orderId=orderId;
		this.itemId=itemId;
		this.userId=userId;
		this.quantity=quantity;
		this.orderDate=orderDate;
		this.status=status;
	}
	public void setOrderId(String orderId)
	{
		this.orderId=orderId;
	}
	
	public void setItemId(String itemId)
	{
		this.itemId=itemId;
	}
	
	public void setUserId(String userId)
	{
		this.userId=userId;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public void setOrderDate(String orderDate)
	{
		this.orderDate=orderDate;
	}
	
	public void setStatus(String status)
	{
		this.status=status;
	}
	
	public String getOrderId()
	{
		return this.orderId;
	}
	
	public String getItemId()
	{
		return this.itemId;
	}
	
	public String getUserId()
	{
		return this.userId;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public String getOrderDate()
	{
		return this.orderDate;
	} 
	public String getStatus()
	{
		return this.status;
	}
	
	public String toStringOrder()
	{
		String str=this.orderId+","+this.itemId+","+this.userId+","+this.quantity+","+this.orderDate+","+this.status+"\n";
		return str;
	}
	
	public Order formOrder(String str)
	{
		String data[]=str.split(",");
		
		Order o=new Order();
		o.setOrderId(data[0]);
		o.setItemId(data[1]);
		o.setUserId(data[2]);
		o.setOrderDate(data[4]);
        o.setQuantity(Integer.parseInt(data[3]));
		o.setStatus(data[5]);
		return o;
		
	}
	
}