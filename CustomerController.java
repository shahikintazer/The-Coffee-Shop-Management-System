package controllers;
import java.lang.*;
import models.*;

public class CustomerController 
{

    public void insertCustomer(Customer c) 
	{
        Customer customers[] = this.getAllCustomers();

        for (int i = 0; i < customers.length; i++) 
		{
            if (customers[i] == null) {
                customers[i] = c;
                break;
          }
        }

        this.write(customers);
    }

    public void updateCustomer(Customer c) 
	{
        Customer customers[] = this.getAllCustomers();

        for (int i = 0; i < customers.length; i++) 
		{
            if (customers[i] != null) {
              if (customers[i].getCustomerId().equals(c.getCustomerId())) 
			  {
                customers[i] = c;
          }
          }
        }

        this.write(customers);
    }

    public void deleteCustomer(String customerId) 
	{
        Customer customers[] = this.getAllCustomers();

        for (int i = 0; i < customers.length; i++) 
		{
            if (customers[i] != null) 
		{
                if (customers[i].getCustomerId().equals(customerId)) 
		    {
               customers[i] = null;
          }
         }
        }

        this.write(customers);
      }

    public Customer searchCustomer(String customerId) 
	{
        Customer customers[] = this.getAllCustomers();

        for (int i = 0; i < customers.length; i++) 
		{
            if (customers[i] != null) 
			{
                if (customers[i].getCustomerId().equals(customerId)) 
				{
                    return customers[i];
                }
            }
        }

        return null;
    }

    public Customer[] getAllCustomers() 
	{
        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/customers.txt";
        FileIO fio = new FileIO();
        String values[] = fio.readFile(fileName);

        Customer customers[] = new Customer[100];
        Customer c = new Customer();

        for (int i = 0; i < values.length; i++) 
		{
            if (values[i] != null) 
			{
                if (customers[i] == null) 
				{
                    customers[i] = c.formCustomer(values[i]);
            }
          }
        }

        return customers;
    }

    public void write(Customer customers[]) 
	{
        String data[] = new String[100];

        for (int i = 0; i < data.length; i++) 
		{
            if (customers[i] != null) 
			{
                data[i] = customers[i].toStringCustomer();
          }
        }

        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/customers.txt";

        FileIO fio = new FileIO();
        fio.writeFile(fileName, data);
    }
}