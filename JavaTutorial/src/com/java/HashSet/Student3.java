package com.java.HashSet;
import java.util.HashSet;
//Real Example
class Employee
	{
		int id;
		String name, address;
		double salary;
		Employee(int id, String name, String address, double salary)
		{
			this.id=id;
			this.name=name;
			this.address=address;
			this.salary=salary;
		}
	}
public class Student3 {
	public static void main(String[] args) {
HashSet<Employee> hs=new HashSet<Employee>();
Employee e1=new Employee(101, "Vinod Yadav", "Zlin", 65000);
Employee e2=new Employee(102, "Sohan Yadav", "Mumbai", 35000);
Employee e3=new Employee(103, "Satish Yadav", "Bhopal",15000);
hs.add(e1);
hs.add(e2);
hs.add(e3);
for(Employee item:hs)
	System.out.println(item.id+" "+item.name+" "+item.address+" "+item.salary);
}
}