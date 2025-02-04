package controllers;
import java.lang.*;
import java.io.*;

public class FileIO
{
	public String[] readFile(String fileName)
	{
		try
		{
			File f=new File(fileName);
			FileReader fd=new FileReader(f);
			BufferedReader bfd=new BufferedReader(fd);
			
			String data[]=new String[100];
			String temp="";
			int i=0;
			while((temp=bfd.readLine())!=null)
			{
				data[i]=temp;
				i++;
			}
			
			bfd.close();
			return data;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void writeFile(String fileName, String data[])
	{
		try
		{
			File f=new File(fileName);
			FileWriter fw=new FileWriter(f,false);
			
			for(int i=0;i<data.length;i++)
			{
				if(data[i]!=null)
				{
					fw.write(data[i]);
					fw.flush();
				}
			}
			
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}