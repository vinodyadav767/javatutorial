package com.java.thisKeyword;

//Real usage of this() constructor call
public class Student5 {
	int id;
	String name;
	int rollNo;
	double fee;

	Student5(int id, String name, int rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}

	Student5(int id, String name, int rollNo, double fee) {
		this(id, name, rollNo);
		this.fee = fee;
		//this(id, name, rollNo); Compile Time Error: Call to this must be first statement in constructor
	}

	void printData() {
		System.out.println(id + " " + name + " " + rollNo + " " + fee);
	}

	public static void main(String[] args) {
		Student5 s1 = new Student5(101, "Yadav", 97156);
		Student5 s2 = new Student5(102, "Vinod", 971566, 150000);
		s1.printData();
		s2.printData();
	}
}
