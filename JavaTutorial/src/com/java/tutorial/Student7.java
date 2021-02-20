package com.java.tutorial;

//Object and Class Example: Rectangle
class Rectangle {
	int length;
	int width;

	void insertData(int a, int b) {
		length = a;
		width = b;
	}

	void printData() {
		System.out.println("Area is: " + length * width);
	}
}

public class Student7 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insertData(10, 20);
		r2.insertData(30, 50);
		r1.printData();
		r2.printData();
	}
}
