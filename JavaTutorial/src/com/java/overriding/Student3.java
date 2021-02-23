package com.java.overriding;

//Simple example of Covariant Return Type

class S3 {
	S3 get() {
		return this;

	}
}

public class Student3 extends S3 {
	Student3 get() {
		return this;
	}

	void message() {
		System.out.println("Welcome to Covarient return Type");
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.message();
	}
}
