package com.java.inheritance;

//Multilevel Inheritance Example
class S3 {
	void s1() {
		System.out.println("Print s1");
	}
}

class S12 extends S3 {
	void s12() {
		System.out.println("Print s12");
	}
}

public class Student3 extends S12 {
	public static void main(String[] args) {
		Student3 s1=new Student3();
		s1.s1();
		s1.s12();
	}
}
