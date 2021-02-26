package com.java.Interface_java;

//Java 8 Static Method in Interface
interface I6 {
	void printData();

	static int printData2(int a) {
		return a * a;
	}
}

class S6 implements I6 {
	public void printData() {
		System.out.println("Now print is also working");
	}
}

public class Student6 {
	public static void main(String[] args) {
		S6 s1 = new S6();
		s1.printData();
		System.out.println(I6.printData2(10));
		System.out.println();
		I6 i1 = new S6();
		i1.printData();
	}
}
