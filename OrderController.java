package controllers;
import java.lang.*;
import models.*;

public class OrderController 
{

    public void insertOrder(Order o) 
	{
        Order orders[] = this.getAllOrders();

        for (int i = 0; i < orders.length; i++) 
		{
            if (orders[i] == null) 
			{
                orders[i] = o;
                break;
         }
        }

        this.write(orders);
    }

    public void updateOrder(Order o) 
	{
        Order orders[] = this.getAllOrders();

        for (int i = 0; i < orders.length; i++) 
		{
            if (orders[i] != null) 
			{
                if (orders[i].getOrderId().equals(o.getOrderId())) 
				{
                    orders[i] = o;
                }
            }
        }

        this.write(orders);
    }

    public void deleteOrder(String orderId) 
	{
        Order orders[] = this.getAllOrders();

        for (int i = 0; i < orders.length; i++) 
		{
            if (orders[i] != null) {
                if (orders[i].getOrderId().equals(orderId)) 
				{
                    orders[i] = null;
                }
            }
        }

        this.write(orders);
    }

    public Order searchOrder(String orderId) 
	{
        Order orders[] = this.getAllOrders();

        for (int i = 0; i < orders.length; i++) 
		{
            if (orders[i] != null) 
			{
                if (orders[i].getOrderId().equals(orderId)) 
				{
                    return orders[i];
                }
            }
        }

        return null;
    }

    public Order[] getAllOrders() {
        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/orders.txt";
        FileIO fio = new FileIO();
        String values[] = fio.readFile(fileName);

        Order orders[] = new Order[100];
        Order o = new Order();

        for (int i = 0; i < values.length; i++) 
		{
            if (values[i] != null) 
			{
                if (orders[i] == null) 
				{
                    orders[i] = o.formOrder(values[i]);
                }
            }
        }

        return orders;
    }

    public void write(Order orders[]) 
	{
        String data[] = new String[100];

        for (int i = 0; i < data.length; i++) 
		{
            if (orders[i] != null) 
			{
                data[i] = orders[i].toStringOrder();
            }
        }

        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/orders.txt";

        FileIO fio = new FileIO();
        fio.writeFile(fileName, data);
    }
}
