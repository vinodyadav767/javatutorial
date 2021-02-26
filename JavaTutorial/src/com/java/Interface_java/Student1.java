package com.java.Interface_java;

//Java Interface Example
interface I1 {
	void printData();
}

class S1 implements I1 {
	public void printData() {
		System.out.println("Interface Implemented");
	}
}

public class Student1 {
	public static void main(String[] args) {
		S1 s1 = new S1();
		s1.printData();
	}
}
