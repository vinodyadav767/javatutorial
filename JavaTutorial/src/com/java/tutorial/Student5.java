package com.java.tutorial;

//Object and Class Example: Initialization through method
class S5 {
	int id;
	String name;

	void insertRecords(int a, String b) {
		id = a;
		name = b;
	}

	void printData() {
		System.out.println(id + " " + name);
	}
}

public class Student5 {
	public static void main(String[] args) {
		S5 s = new S5();
		S5 s1 = new S5();
		s.insertRecords(101, "Vinod");
		s1.insertRecords(102, "Yadav");
		s.printData();
		s1.printData();
	}

}
