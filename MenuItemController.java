package controllers;
import java.lang.*;
import models.*;

public class MenuItemController 
{

    public void insertMenuItem(MenuItem item) 
	{
        MenuItem menuItems[] = this.getAllMenuItems();

        for (int i = 0; i < menuItems.length; i++) 
		{
            if (menuItems[i] == null) 
          {
              menuItems[i] = item;
              break;
          }
        }

        this.write(menuItems);
    }

    public void updateMenuItem(MenuItem item) 
	{
        MenuItem menuItems[] = this.getAllMenuItems();

        for (int i = 0; i < menuItems.length; i++) 
		  {
            if (menuItems[i] != null) 
			{
                if (menuItems[i].getItemId().equals(item.getItemId())) 
			{
                    menuItems[i] = item;
            }
          }
         }

        this.write(menuItems);
    }

    public void deleteMenuItem(String itemId) 
	{
        MenuItem menuItems[] = this.getAllMenuItems();

        for (int i = 0; i < menuItems.length; i++) 
		{
            if (menuItems[i] != null) 
			{
                if (menuItems[i].getItemId().equals(itemId)) 
				{
                    menuItems[i] = null;
                }
            }
        }

        this.write(menuItems);
    }

    public MenuItem searchMenuItem(String itemId) 
	{
        MenuItem menuItems[] = this.getAllMenuItems();

        for (int i = 0; i < menuItems.length; i++) 
		{
            if (menuItems[i] != null) {
                if (menuItems[i].getItemId().equals(itemId)) 
				{
                    return menuItems[i];
                }
            }
        }

        return null;
    }

    public MenuItem[] getAllMenuItems() 
	{
        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/menuitems.txt";
        FileIO fio = new FileIO();
        String values[] = fio.readFile(fileName);

        MenuItem menuItems[] = new MenuItem[100];
        MenuItem item = new MenuItem();

        for (int i = 0; i < values.length; i++) 
		{
            if (values[i] != null) 
			{
                if (menuItems[i] == null) 
				{
                    menuItems[i] = item.formMenuItem(values[i]);
                }
            }
        }

        return menuItems;
    }

    public void write(MenuItem menuItems[]) 
	{
        String data[] = new String[100];

        for (int i = 0; i < data.length; i++) 
		{
            if (menuItems[i] != null) 
			{
                data[i] = menuItems[i].toStringMenuItem();
            }
        }

        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/menuitems.txt";

        FileIO fio = new FileIO();
        fio.writeFile(fileName, data);
    }
}
