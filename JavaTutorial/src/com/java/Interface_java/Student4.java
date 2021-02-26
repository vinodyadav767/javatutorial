package com.java.Interface_java;

//Multiple inheritance in Java by interface
interface I4 {
	void printData1();
}

interface I40 {
	void printData2();
}

class S4 implements I4, I40 {
	public void printData1() {
		System.out.println("Printing data 1");
	}

	public void printData2() {
		System.out.println("Printing data 2");
	}

}

public class Student4 {
	public static void main(String[] args) {
		S4 s1 = new S4();
		s1.printData1();
		s1.printData2();
	}
}
