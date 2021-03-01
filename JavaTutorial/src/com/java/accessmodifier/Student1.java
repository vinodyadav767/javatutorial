package com.java.accessmodifier;

//Simple example of private access modifier
class S1 {
	private int data = 40;

	private void run() {
		System.out.println("Private method is running");
	}

	public static void main(String[] args) {
		S1 s1 = new S1();
		s1.run();
		System.out.println(s1.data);
	}
}

public class Student1 {
	public static void main(String[] args) {
		S1 s1 = new S1();
		// s1.run(); compile time error
		// System.out.println(s1.data); compile time error
	}
}
