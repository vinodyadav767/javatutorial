package com.java.staticMethods;

//Example of static method
public class Student1 {
	int id;
	String name;
	static String university = "UTB";

	Student1(int i, String n) {
		id = i;
		name = n;
	}

	static void changeUniversity() {
		university = "Miskolc";
	}

	void printData() {
		System.out.println(id + " " + name + " " + "" + university);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Vinod");
		Student1 s2 = new Student1(102, "Yadav");
		s1.printData();
		Student1.changeUniversity();
		s2.printData();
	}
}
