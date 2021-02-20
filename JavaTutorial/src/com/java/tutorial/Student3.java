package com.java.tutorial;

//Object and Class Example: Initialization through reference
class S3 {
	int id;
	String name;
}

public class Student3 {
	public static void main(String[] args) {
		S3 s = new S3();
		s.id = 101;
		s.name = "Vinod Yadav";
		System.out.println(s.id+" "+s.name);
	}
}
