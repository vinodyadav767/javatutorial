package com.java.superkeyword;

//super example: real use
class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person {
	double salary;

	Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	void print() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Student5 {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Vinod Yadav", 50000);
		e.print();
	}

}
