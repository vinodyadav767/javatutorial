package com.tutorial.constructor;

public class Student4 {
	int id;
	String name;
	int rollNo;

	Student4(int i, String n, int r) {
		id = i;
		name = n;
		rollNo = r;
	}

	Student4(Student4 s) {
		id = s.id;
		name = s.name;
		rollNo = s.rollNo;
	}

	void printData() {
		System.out.println(id + " " + name + " " + rollNo);
	}

	public static void main(String[] args) {
		Student4 s = new Student4(101, "Vinod", 97156);
		Student4 s2 = new Student4(s);
		s.printData();
		s2.printData();
	}
}
