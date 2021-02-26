package com.java.abstract_class;

//Example of Abstract class that has an abstract method
abstract class S1 {
	abstract void run();

}

public class Student1 extends S1 {

	void run() {
		System.out.println("Runnning safely");
	}

	public static void main(String[] args) {
//		Student1 s1 = new Student1();
//		s1.run();
		S1 s1=new Student1();
		s1.run();
	}

}
