package controllers;
import java.lang.*;
import models.*;

public class EmployeeController 
{

    public void insertEmployee(Employee e) 
	{
        Employee employees[] = this.getAllEmployees();

        for (int i = 0; i < employees.length; i++) 
		{
            if (employees[i] == null) 
			{
                employees[i] = e;
                break;
            }
        }

        this.write(employees);
    }

    public void updateEmployee(Employee e) 
	{
        Employee employees[] = this.getAllEmployees();

        for (int i = 0; i < employees.length; i++) 
		{
            if (employees[i] != null) 
			{
                if (employees[i].getEmployeeId().equals(e.getEmployeeId())) 
				{
                    employees[i] = e;
                }
            }
        }

        this.write(employees);
    }

    public void deleteEmployee(String employeeId) 
	{
        Employee employees[] = this.getAllEmployees();

        for (int i = 0; i < employees.length; i++) 
		{
            if (employees[i] != null) 
			{
                if (employees[i].getEmployeeId().equals(employeeId)) 
				{
                    employees[i] = null;
                }
            }
        }

        this.write(employees);
    }

    public Employee searchEmployee(String employeeId) 
	{
        Employee employees[] = this.getAllEmployees();

        for (int i = 0; i < employees.length; i++) 
		{
            if (employees[i] != null) 
		  {
                if (employees[i].getEmployeeId().equals(employeeId)) 
			{
                    return employees[i];
             }
            }
        }

        return null;
    }

    public Employee[] getAllEmployees() {
        String fileName = "D:/Download/Java/Main_Project/Main_Project/controllers/data/employee.txt";
        FileIO fio = new FileIO();
        String values[] = fio.readFile(fileName);

        Employee employees[] = new Employee[100];
        Employee e = new Employee();

        for (int i = 0; i < values.length; i++) 
		{
            if (values[i] != null) 
			{
                if (employees[i] == null) 
				{
                    employees[i] = e.formEmployee(values[i]);
             }
            }
		}

        return employees;
    }

    public void write(Employee employees[]) 
	{
        String data[] = new String[100];

        for (int i = 0; i < data.length; i++) 
		{
            if (employees[i] != null) 
			{
                data[i] = employees[i].toStringEmployee();
            }
        }

        String fileName = "D/Download/Java/Main_Project/Main_Project/controllers/data/employee.txt";

        FileIO fio = new FileIO();
        fio.writeFile(fileName, data);
    }
}
