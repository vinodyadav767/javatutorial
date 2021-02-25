package com.java.polymorphism;

//Example of Java Runtime Polymorphism
class S1 {
	void printData() {
		System.out.println("S1 class is printing here");
	}
}

public class Student1 extends S1 {
	void printData() {
		System.out.println("Student1 class is printing here");
	}

	public static void main(String[] args) {
		S1 s1 = new Student1();
		s1.printData();
	}

}
