package com.java.tutorial;

//We can create multiple objects by one type only as we do in case of primitives.
class S9 {
	int length;
	int width;

	void areaRect(int l, int w) {
		length = l;
		width = w;
	}

	void printArea() {
		System.out.println(length * width);
	}
}

public class Student9 {
	public static void main(String[] args) {
		S9 s1 = new S9(), s2 = new S9(), s3 = new S9();
		s1.areaRect(10, 20);
		s2.areaRect(20, 30);
		s3.areaRect(30, 40);
		s1.printArea();
		s2.printArea();
		s3.printArea();
	}
}
