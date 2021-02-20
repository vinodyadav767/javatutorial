package com.java.staticVariable;

//Example of static variable
class S1 {
	int id;
	String name;
	static String university = "UTB";

	S1(int i, String n) {
		id = i;
		name = n;
	}

	void printData() {
		System.out.println(id + " " + name + " " + university);
	}
}

public class Student1 {
	public static void main(String[] args) {
		S1 s1 = new S1(101, "Vinod");
		S1 s2 = new S1(102, "Yadav");
		s1.printData();
		s2.printData();

	}

}
