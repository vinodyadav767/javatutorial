package com.java.tutorial;

//Object and Class Example: Employee
class Employee {
	int id;
	String name;
	double salary;

	void insertData(int a, String b, double c) {
		id = a;
		name = b;
		salary = c;
	}

	void printData() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Student6 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.insertData(101, "Vinod", 25000);
		Employee e2 = new Employee();
		e2.insertData(102, "Yadav", 30000);
		e1.printData();
		e2.printData();
	}
}
