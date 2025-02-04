package controllers;
import java.lang.*;
import models.*;

public class AdminController
{
	public void insertAdmin(Admin a)
	{
		Admin admin[]=this.getAllAdmin();
		
		for(int i=0;i<admin.length;i++)
		{
			if(admin[i]==null)
			{
				admin[i]=a;
				break;
			}
		}
		
		this.write(admin);
		
		
	}
	
	public void updateAdmin(Admin a)
	{
		Admin admin[]=this.getAllAdmin();
		
		for(int i=0;i<admin.length;i++)
		{
			if(admin[i]!=null)
			 {
				if(admin[i].getUserId().equals(a.getUserId()))
			 {
			 admin[i]=a;
		     }
	         }
		}
		
		this.write(admin);
	}
	
	public void deleteAdmin(String userId)
	{
		Admin admin[]=this.getAllAdmin();
		
		for(int i=0;i<admin.length;i++)
		  {
			if(admin[i]!=null)
			{
			  if(admin[i].getUserId().equals(userId))
	      {
	        admin[i]=null;
		 }
	       }
		 }
		
		this.write(admin);
	}
	
	public Admin searchAdmin(String userId)
	{
		Admin admin[]=this.getAllAdmin();
		
		for(int i=0;i<admin.length;i++)
		{
			if(admin[i]!=null)
			{
				if(admin[i].getUserId().equals(userId))
			 {
					
					return admin[i];
		    }
		  }
			
		}
		
		return null;
	}
	
	public Admin[] getAllAdmin()
	{
		String fileName="D:/Download/Java/Main_Project/Main_Project/controllers/data/admins.txt";
		FileIO fio=new FileIO();
		String values[]=fio.readFile(fileName);
		
		Admin admin[]=new Admin[100];
		
		Admin a=new Admin();
		
		for(int i=0;i<values.length;i++)
		{
			if(values[i]!=null)
			{
				if(admin[i]==null)
			 {
					admin[i]=a.formAdmin(values[i]);
			}
		  }
			
		}
		
		return admin;
	}
	
	public void write(Admin admin[])
	{
		String data[]=new String[100];
		
		for(int i=0;i<data.length;i++)
		{
			if(admin[i]!=null)
		 {
				data[i]=admin[i].toStringAdmin();
		 }
		}
		
		String fileName="D:/Download/Java/Main_Project/Main_Project/controllers/data/admins.txt";
		
		FileIO fio=new FileIO();
		fio.writeFile(fileName, data);
	}
}