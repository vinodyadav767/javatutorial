package com.java.tutorial;

//Object and Class Example: main outside the class
class S1 {
	int id;
	String name;
}

public class Student2 {
	public static void main(String[] args) {
		S1 s = new S1();
		System.out.println(s.id + "  " + s.name);
	}
}
